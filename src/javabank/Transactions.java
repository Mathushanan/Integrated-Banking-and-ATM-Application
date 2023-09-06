package javabank;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Component;
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

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());

        }
        return model;

    }

}
