package Proyecto;

import java.sql.*;

public class ConexionDB {
    private Connection conexion;
    private PreparedStatement consulta;
    private ResultSet datos;
    private final String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/";
    
    public Connection getConnection(String DB, String usr, String pwr) {
        try {
            Class.forName(driver);
            url += DB;
            conexion = DriverManager.getConnection(url,usr,pwr);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error en la conexion");
            conexion = null;
        }
        return conexion;
    }
    
    public void consultar() {
        try {
            conexion = (Connection) this.getConnection("Proyecto", "root", "");
            consulta = conexion.prepareStatement("SELECT Nombre,RFC FROM Proyecto.Vendedores");
            datos = consulta.executeQuery();
            
            while (datos.next()) {
                System.out.println("Nombre = " + datos.getString("Nombre") + "\n" + "RFC = " + datos.getString("RFC"));
            }    
        } catch (SQLException e) {
            System.err.println("No se pudo hacer la consulta");
        } finally {
            this.desconectar();
        }
    }
    
    public void desconectar() {
        try {
            conexion.close();
            consulta.close();
            datos = null;
        } catch (SQLException e) {
            System.err.println("No se pudo desconectar");
        }
    }
}
