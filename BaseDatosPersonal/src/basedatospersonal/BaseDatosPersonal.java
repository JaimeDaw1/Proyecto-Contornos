
package basedatospersonal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDatosPersonal {
    
    Connection conn;
    
   static IntroducirDatos prueba = new IntroducirDatos();
    
   public Connection conexion(){
          try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://172.16.108.5:3306/AlumnoPrueba", "Prueba", "abc123.");
             System.out.println("¿Hay conexión? " + conn.isValid(0));
       
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosPersonal.class.getName()).log(Level.SEVERE, null, ex);
        } return conn;
   }
    
 

    public static void main(String[] args) {
        prueba.setVisible(true);
        prueba.setLocationRelativeTo(null);
      
    }
    
}
