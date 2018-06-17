package Proyecto;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

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
            JOptionPane.showMessageDialog(null, "Error en la conexion", "Error", ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "No se pudo hacer la consulta", "Error", ERROR_MESSAGE);
        } finally {
            this.desconectar();
        }
    }
    //login
    public String login(String DB, String usr, String psswrd, String tabla, String id) {
        String contrasena = null;
        try {
            conexion = (Connection) this.getConnection(DB, usr, psswrd);
            String sql = "SELECT Constraseña FROM "+DB+"."+tabla+" WHERE ClaveVendedor = "+id;
            consulta = conexion.prepareStatement(sql);
            datos = consulta.executeQuery();
            while (datos.next()) {
                contrasena = datos.getString("Constraseña");
            }    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en al iniciar sesion", "Error", ERROR_MESSAGE);
        } finally {
            this.desconectar();
        }
        return contrasena;
    }
    
    //Modificar para insertar
    public void insertar(String DB, String usr, String psswrd, String tabla, String col) {
        try {
            conexion = (Connection) this.getConnection(DB, usr, psswrd);
            String sql = "";
            inserta = conexion.prepareStatement("SELECT "+col+" FROM "+DB+"."+tabla);
            datosi = inserta.executeUpdate();
            
            if (datosi == 1) {
                JOptionPane.showMessageDialog(null, "Valores correctamente insertados", "Informacion", INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Valores correctamente insertados", "Informacion", WARNING_MESSAGE);
            }
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede insertar", "Error", ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "No se pudo desconectar", "Error", ERROR_MESSAGE);
        }
    }
}