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
import java.sql.ResultSet;

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
    
    public void listarUsuarios() {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = Conexion.conectar();
        
        String sql = "SELECT * FROM usuario";
        
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        System.out.println("LISTA DE USUARIOS:");
        
        while (rs.next()) {
            int id = rs.getInt("userid");
            String username = rs.getString("username");
            String password = rs.getString("userpassword");
            
            System.out.println(id + " - " + username + " - " + password);
        }
        
    } catch (Exception e) {
        System.out.println("Error al listar: " + e.getMessage());
    }
}
    
public void actualizarUsuario(int userid, String nuevoUsername, String nuevoPassword) {
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
        con = Conexion.conectar();
        
        String sql = "UPDATE usuario SET username = ?, userpassword = ? WHERE userid = ?";
        
        ps = con.prepareStatement(sql);
        ps.setString(1, nuevoUsername);
        ps.setString(2, nuevoPassword);
        ps.setInt(3, userid);
        
        ps.executeUpdate();
        
        System.out.println("Usuario actualizado correctamente");
        
    } catch (Exception e) {
        System.out.println("Error al actualizar: " + e.getMessage());
    }
}   
    
}
