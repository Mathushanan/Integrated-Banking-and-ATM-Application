
package javabank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Component;

public class AccountsTableValues {
    
    private int accountId;
    private int userId;
    private int accountNumber;
    private double balance;
    private String type;
    private String mail;
    private boolean isAvailable=false;
    private Component form;
    
    
    public AccountsTableValues(String mail,Component form,String Type){
        
        this.mail=mail;
        this.form=form;
        
        try{
            DatabaseConnection con=new DatabaseConnection();
            Connection connection=con.createConnection();
            String selectQuery="SELECT * FROM accounts WHERE email=? && type=?";
            PreparedStatement statement=connection.prepareStatement(selectQuery);
            statement.setString(1, mail);
             statement.setString(2, Type);
            
            ResultSet set=statement.executeQuery();
            
            if(set.next()){
                isAvailable=true;
                this.accountId=set.getInt("accountId");
                this.userId=set.getInt("userId");
                this.accountNumber=set.getInt("accountNumber");
                this.balance=set.getDouble("balance");
                this.type=set.getString("type");
            }else{
                isAvailable=false;
            }
            
            set.close();
            connection.close();
            
        }catch(Exception ex){
            MessageBox messageBox=new MessageBox();
            messageBox.getMessageBoxErr(form, mail);
        }
  
    }
    public boolean isAccountAvailable(){
        return isAvailable;
    }
    public int getIntValues(String key){
        if(key=="userId"){
            return userId;
        }else if(key=="accountId"){
            return accountId;
        }else{
            return accountNumber;
        }
    }
    public double getDoubleValues(String key){
        if(key=="balance"){
            return balance;
        }else{
            return balance;
        }
    }
    public String getStringValues(String key){
        if(key=="type"){
            return type;
        }else{
            return type;
        }
    }
    public boolean insertValues(int UserId,String Mail,int AccNo,double Balance,String Type){
        
        boolean isInserted=false;
        
        try{
            
            DatabaseConnection con=new DatabaseConnection();
            Connection connection=con.createConnection();
            String insertQuery="INSERT INTO accounts (userId,email,accountNumber,balance,type) VALUES (?,?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(insertQuery);
            statement.setInt(1,UserId);
            statement.setString(2, Mail);
            statement.setInt(3, AccNo);
            statement.setDouble(4, Balance);
            statement.setString(5,Type);
            
            int rows=statement.executeUpdate();
            if(rows>0){
                isInserted=true;
            }
            connection.close();
            
             
        }
        catch(Exception ex){
            MessageBox messageBox=new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isInserted;
    }
    
    
    
}
