
package javabank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaBank {

   
    public static void main(String[] args) throws SQLException {
        
        /*Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        System.out.print(c);*/
        
        Login l=new Login();
        l.show();
       
    }
    
}
