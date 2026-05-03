/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploconexionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
public class EjemploConexionJDBC {

    
    public static void main(String[] args) {
        
       /* UsuarioDAO dao = new UsuarioDAO();
    
    dao.insertarUsuario("sofia", "12345");
*/
       
     /*  UsuarioDAO dao = new UsuarioDAO();
    
    dao.listarUsuarios();
*/

     UsuarioDAO dao = new UsuarioDAO();
    
    dao.actualizarUsuario(8, "sofia_actualizada", "99999");
    dao.listarUsuarios();
    }
    
}
