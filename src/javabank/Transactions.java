
package javabank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Component;


public class Transactions {
    
    private String mail;
    private Component form;
    
    
    public Transactions(String mail,Component form){
        this.mail=mail;
        this.form=form; 
    }
    
    public boolean makeBillTransaction(int AccNo,double Amount,String Type,String DateTime){
        boolean isInserted=false;
        
        try{
            DatabaseConnection con=new DatabaseConnection();
            Connection connection=con.createConnection();
            String insertQuery="INSERT INTO transaction (email,accountNumber,amount,type,dateAndTime) VALUES (?,?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(insertQuery);
            statement.setString(1, mail);
            statement.setInt(2,AccNo);
            statement.setDouble(3, Amount);
            statement.setString(4,Type);
            statement.setString(5, DateTime);
            
            if(statement.executeUpdate()>0){
                isInserted=true;
            }
            connection.close();
            
        }catch(Exception ex){
            MessageBox messageBox=new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isInserted;
        
    }
    public boolean makeSavingsTransaction(){
        
    }
    
}
