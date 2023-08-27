
package javabank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
    
    
    public Connection createConnection() throws SQLException{
        
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaBank?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        return connection;
        
    }
    
    
}
