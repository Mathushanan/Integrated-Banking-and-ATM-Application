
package javabank;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.Component;

public class UserTableValues {
    
    private int userId;
    private String mail;
    private String mobile;
    private String nic;
    private String fName;
    private String lName;
    private String address;
    private String dob;
    private String userName;
    private String password;
    
    
    public UserTableValues(String mail,Component form){
        this.mail=mail;
        
        try{
            DatabaseConnection con=new DatabaseConnection();
            Connection connection=con.createConnection();
            
            String selectQuery="SELECT * FROM users WHERE email=?";
            PreparedStatement statement=connection.prepareStatement(selectQuery);
            statement.setString(1, mail);
            
            ResultSet set=statement.executeQuery();
            
            if(set.next()){
                this.userId=set.getInt("userId");
                this.address=set.getString("address");
                this.dob=set.getString("dateOfBirth");
                this.fName=set.getString("firstName");
                this.lName=set.getString("lastName");
                this.mobile=set.getString("mobile");
                this.password=set.getString("password");
                this.nic=set.getString("email");
            }
            
            set.close();
            connection.close();
            
        }catch(Exception ex){
            MessageBox messageBox=new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
          
    }
    
    public String getStringValue(String key){
        if(key=="userName"){
            return userName;
        }else if(key=="mobile"){
            return mobile;
        }else if(key=="nic"){
            return nic;
        }else if(key=="firstName"){
            return fName;
        }else if(key=="lastName"){
            return lName;
        }else if(key=="dateOfBirth"){
            return dob;
        }else if(key=="address"){
            return address;
        }else{
            return password;
        }
    }
    public int getIntValue(String key){
        if(key=="userId"){
            return userId;
        }else {
            return userId;
        }
    }
    
    
    
}
