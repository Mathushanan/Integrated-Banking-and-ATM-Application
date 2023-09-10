package javabank;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Component;
import java.sql.SQLException;
import javax.swing.table.*;

public class Transactions {

    private String mail;
    private Component form;

    public Transactions(String mail, Component form) {
        this.mail = mail;
        this.form = form;
    }

    public boolean makeBillTransaction(int AccNo, double Amount, String Type, String DateTime) {
        boolean isInserted = false;

        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String insertQuery = "INSERT INTO transaction (email,accountNumber,amount,type,dateAndTime) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setString(1, mail);
            statement.setInt(2, AccNo);
            statement.setDouble(3, Amount);
            statement.setString(4, Type);
            statement.setString(5, DateTime);

            if (statement.executeUpdate() > 0) {
                isInserted = true;
            }
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isInserted;

    }

    public boolean makeMoneyTransaction(int AccNo, double Amount, String Type, String DateTime) {
        boolean isInserted = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String insertQuery = "INSERT INTO transaction (email,accountNumber,amount,type,dateAndTime) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setString(1, mail);
            statement.setInt(2, AccNo);
            statement.setDouble(3, Amount);
            statement.setString(4, Type);
            statement.setString(5, DateTime);

            if (statement.executeUpdate() > 0) {
                isInserted = true;
            }
            connection.close();
        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isInserted;
    }

    public boolean updateRecipientTransaction(int AccNo, double Amount, String Type, String DateTime, Component form) {

        AccountsTableValues obj1 = new AccountsTableValues(mail, form);
        String recipientMail = obj1.findMailByAccountNumber(AccNo);

        boolean isInserted = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String insertQuery = "INSERT INTO transaction (email,accountNumber,amount,type,dateAndTime) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setString(1, recipientMail);
            statement.setInt(2, AccNo);
            statement.setDouble(3, Amount);
            statement.setString(4, Type);
            statement.setString(5, DateTime);

            if (statement.executeUpdate() > 0) {
                isInserted = true;
            }
            connection.close();
        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isInserted;
    }

    public DefaultTableModel getTransactionTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT accountNumber,amount,type,dateAndTime FROM transaction WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);

            ResultSet data = statement.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) data.getMetaData();

            int col = rsmd.getColumnCount();
            String[] colName = new String[col];
            for (int i = 0; i < col; i++) {
                colName[i] = rsmd.getColumnName(i + 1);
            }
            model.setColumnIdentifiers(colName);

            while (data.next()) {
                String AccNo = data.getString("accountNumber");
                String Amount = data.getString("amount");
                String type = data.getString("type");
                String Date = data.getString("dateAndTime");
                String[] arr = {AccNo, Amount, type, Date};
                model.addRow(arr);
            }
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());

        }
        return model;

    }
    public DefaultTableModel getSearchedTransactiontableModel(String searchKey) throws SQLException{
        DefaultTableModel model=new DefaultTableModel();
        try{
            DatabaseConnection con=new DatabaseConnection();
            Connection connection=con.createConnection();
            String selectQuery="SELECT accountNumber,amount,type,dateAndTime FROM transaction WHERE accountNumber LIKE ? || amount LIKE ? || type LIKE ? || dateAndTime LIKE ?";
            PreparedStatement statement=connection.prepareStatement(selectQuery);
            searchKey="%"+searchKey+"%";
            statement.setString(1,searchKey);
            statement.setString(2,searchKey);
            statement.setString(3,searchKey);
            statement.setString(4,searchKey);
            
            ResultSet set=statement.executeQuery();
            ResultSetMetaData rsmd=(ResultSetMetaData)set.getMetaData();
            
            String[] arr=new String[rsmd.getColumnCount()];
            for(int i=0;i<rsmd.getColumnCount();i++){
                arr[i]=rsmd.getColumnName(i+1);
            }
            model.setColumnIdentifiers(arr);
            
            while(set.next()){
                String[] values={String.valueOf(set.getInt("accountNumber")),String.valueOf(set.getDouble("amount")),set.getString("type"),set.getString("dateAndTime")};
                model.addRow(values);
            }
            connection.close();
        }catch(Exception ex){
            MessageBox messageBox=new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return model;
    }
    public boolean updateMobileRechargeTransaction(double Amount,String Mobile){
        boolean isInserted=false;
        try{
            DatabaseConnection con=new DatabaseConnection();
            Connection connection=con.createConnection();
            String insertQuery="INSERT INTO transaction (email,accountNumber,amount,type,dateAndTime) VALUES (?,?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(insertQuery);
            statement.setString(1,mail);
            statement.setString(2,Mobile);
            statement.setDouble(3, Amount);
            statement.setString(4,"Mobile Reload");
            DateAndTime date=new DateAndTime();
            statement.setString(5, date.getDateAndTime());
            
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

}
