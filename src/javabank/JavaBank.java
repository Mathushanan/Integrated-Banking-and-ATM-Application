
package javabank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;

public class JavaBank extends JFrame {

   
    public static void main(String[] args) throws SQLException {
        
        /*Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        System.out.print(c);*/
        
        Main m=new Main();
        
         m.setVisible(true);
        
        
    
       
    }
    
}
