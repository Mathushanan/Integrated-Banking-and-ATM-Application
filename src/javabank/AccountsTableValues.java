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
    private boolean isAvailable = false;
    private Component form;

    public AccountsTableValues(String mail, Component form) {
        this.mail = mail;
    }

    public void assignAccountTableValues(String Type) {
        this.mail = mail;
        this.form = form;

        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT * FROM accounts WHERE email=? && type=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);
            statement.setString(2, Type);

            ResultSet set = statement.executeQuery();

            if (set.next()) {
                isAvailable = true;
                this.accountId = set.getInt("accountId");
                this.userId = set.getInt("userId");
                this.accountNumber = set.getInt("accountNumber");
                this.balance = set.getDouble("balance");
                this.type = set.getString("type");
            } else {
                isAvailable = false;
            }

            set.close();
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, mail);
        }

    }

    public boolean isAccountAvailable() {
        return isAvailable;
    }

    public int getIntValues(String key) {
        if (key == "userId") {
            return userId;
        } else if (key == "accountId") {
            return accountId;
        } else {
            return accountNumber;
        }
    }

    public double getDoubleValues(String key) {
        if (key == "balance") {
            return balance;
        } else {
            return balance;
        }
    }

    public String getStringValues(String key) {
        if (key == "type") {
            return type;
        } else {
            return type;
        }
    }

    public boolean insertValues(int UserId, String Mail, int AccNo, double Balance, String Type) {

        boolean isInserted = false;

        try {

            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String insertQuery = "INSERT INTO accounts (userId,email,accountNumber,balance,type) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setInt(1, UserId);
            statement.setString(2, Mail);
            statement.setInt(3, AccNo);
            statement.setDouble(4, Balance);
            statement.setString(5, Type);

            int rows = statement.executeUpdate();
            if (rows > 0) {
                isInserted = true;
            }
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isInserted;
    }

    public int getTotalCountOfAccounts() {

        int count = 0;
        try {

            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT COUNT(*) FROM accounts WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);

            ResultSet set = statement.executeQuery();
            if (set.next()) {
                count = set.getInt(1);
                set.close();
                connection.close();
                return count;
            }
            set.close();
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return count;
    }

    public double getBalance(String type) {

        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT balance FROM accounts WHERE email=? && type=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);
            statement.setString(2, type);
            ResultSet set = statement.executeQuery();

            if (set.next()) {
                double balance = set.getDouble("balance");
                set.close();
                connection.close();
                return balance;
            }
            set.close();
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return 0;

    }

    public String getNameOfAccountNumber(int accNo, Component form) {
        String name = "";
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();

            String selectMailQuery = "SELECT email FROM accounts WHERE accountNumber=?";
            String selectNameQuery = "SELECT firstName FROM users WHERE email=?";

            PreparedStatement statement1 = connection.prepareStatement(selectMailQuery);
            PreparedStatement statement2 = connection.prepareStatement(selectNameQuery);

            statement1.setInt(1, accNo);
            ResultSet mailSet = statement1.executeQuery();
            String mail = "";
            if (mailSet.next()) {
                mail = mailSet.getString("email");
            }

            statement2.setString(1, mail);
            ResultSet nameSet = statement2.executeQuery();

            if (nameSet.next()) {
                name = nameSet.getString("firstName");
            }

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return name;
    }

    public boolean updateTransferFunds(double money, String type, int accNo) {
        boolean isUpdated = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();

            String ownerUpdateQuery = "UPDATE accounts SET balance=? WHERE accountNumber=? && type=?";
            String holderUpdateQuery = "UPDATE accounts SET balance=? WHERE accountNumber=? && type=?";

            String balanceQuery = "SELECT balance FROM accounts WHERE accountNumber=?";

            PreparedStatement statement1 = connection.prepareStatement(ownerUpdateQuery);
            PreparedStatement statement2 = connection.prepareStatement(holderUpdateQuery);

            PreparedStatement statement3 = connection.prepareStatement(balanceQuery);

            statement3.setInt(1, accNo);
            double Balance = 0;
            ResultSet set = statement3.executeQuery();
            if (set.next()) {
                Balance = set.getDouble("balance");
            }
            statement1.setDouble(1, balance - money);
            statement1.setInt(2, accountNumber);
            statement1.setString(3, type);

            statement2.setDouble(1, money + Balance);
            statement2.setInt(2, accNo);
            statement2.setString(3, type);

            if (statement1.executeUpdate() > 0 && statement2.executeUpdate() > 0) {
                MessageBox messageBox = new MessageBox();
                messageBox.getMessageBoxInfo(form, "Transaction Succesfull!");
                isUpdated = true;
            } else {
                MessageBox messageBox = new MessageBox();
                messageBox.getMessageBoxInfo(form, "Transaction Failed!");
            }

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());

        }
        return isUpdated;
    }

    public boolean isCorrectAccountType(String Type, int AccNo, Component Form) {
        boolean isAvailable = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT COUNT(*) FROM accounts WHERE accountNumber=? && type=?";

            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setInt(1, AccNo);
            statement.setString(2, type);

            ResultSet set = statement.executeQuery();
            
            if (set.next()) {
                if (set.getInt(1) > 0) {
                    isAvailable = true;
                }
            }
            set.close();
            connection.close();
        }catch(Exception ex){
            MessageBox messageBox=new MessageBox();
            messageBox.getMessageBoxErr(Form, ex.getMessage());
        }
        
        return isAvailable;
    }

}
