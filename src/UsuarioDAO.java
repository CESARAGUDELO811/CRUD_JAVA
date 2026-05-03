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
import java.sql.PreparedStatement;

public class UsuarioDAO {
    
    public void insertarUsuario(String username, String password) {
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = Conexion.conectar();
            
            String sql = "INSERT INTO usuario (username, userpassword) VALUES (?, ?)";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ps.executeUpdate();
            
            System.out.println("Usuario insertado correctamente");
            
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }
}
