package Proyecto;

import java.sql.*;

public class ConexionDB {
    private Connection conexion;
    private PreparedStatement consulta;
    private PreparedStatement inserta;
    public ResultSet datos;//posible public
    private int datosi;
    private final String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/";
    
    public ConexionDB() {
        this.conexion = null;
        this.consulta = null;
        this.datos = null;
    }
    
    public Connection getConnection(String DB, String usr, String psswrd) {
        try {
            Class.forName(driver);
            url += DB;
            conexion = DriverManager.getConnection(url,usr,psswrd);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error en la conexion");
            conexion = null;
        }
        return conexion;
    }
    
    public void consultar(String DB, String usr, String psswrd, String tabla, String col) {
        try {
            conexion = (Connection) this.getConnection(DB, usr, psswrd);
            String sql = "SELECT "+col+" FROM "+DB+"."+tabla;
            consulta = conexion.prepareStatement(sql);
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
    
    
    //Modificar para insertar
    public void insertar(String DB, String usr, String psswrd, String tabla, String col) {
        try {
            conexion = (Connection) this.getConnection(DB, usr, psswrd);
            String sql = "";
            inserta = conexion.prepareStatement("SELECT "+col+" FROM "+DB+"."+tabla);
            datosi = inserta.executeUpdate();
            
            if (datosi == 1) {
                System.out.println("Valores correctamente insertados");
            } else {
                System.out.println("No se pudo insertar");
            }
   
        } catch (SQLException e) {
            System.err.println("No se pude insertar");
        } finally {
            this.desconectar();
        }
    }
    
    public void desconectar() {
        try {
           if(conexion != null) conexion.close();
           if(consulta != null) consulta.close();
           if(datos != null) datos.close();
        } catch (SQLException e) {
            System.err.println("No se pudo desconectar");
        }
    }
}