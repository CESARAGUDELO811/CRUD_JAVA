/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
package ejemploconexionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public static Connection conectar() {
        Connection con = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/prueba";
            String user = "root";
            String pass = "";
            
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
            
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        
        return con;
    }
}