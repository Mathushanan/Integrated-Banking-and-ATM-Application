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
    private Component form;

    public UserTableValues(String mail, Component form) {
        this.mail = mail;
        this.form = form;

        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();

            String selectQuery = "SELECT * FROM users WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);

            ResultSet set = statement.executeQuery();

            if (set.next()) {
                this.userId = set.getInt("userId");
                this.address = set.getString("address");
                this.dob = set.getString("dateOfBirth");
                this.fName = set.getString("firstName");
                this.lName = set.getString("lastName");
                this.mobile = set.getString("mobile");
                this.password = set.getString("password");
                this.nic = set.getString("nic");
                this.userName = set.getString("userName");
            }

            set.close();
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }

    }

    public String getStringValue(String key) {
        if (key == "userName") {
            return userName;
        } else if (key == "mobile") {
            return mobile;
        } else if (key == "nic") {
            return nic;
        } else if (key == "firstName") {
            return fName;
        } else if (key == "lastName") {
            return lName;
        } else if (key == "dateOfBirth") {
            return dob;
        } else if (key == "address") {
            return address;
        } else {
            return password;
        }
    }

    public int getIntValue(String key) {
        if (key == "userId") {
            return userId;
        } else {
            return userId;
        }
    }

    public boolean changePassword(String newPassword) {

        boolean isUpdated = false;

        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String updateQuery = "UPDATE users SET password=? WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(updateQuery);
            statement.setString(1, newPassword);
            statement.setString(2, mail);

            if (statement.executeUpdate() > 0) {
                isUpdated = true;
            }

            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }

        return isUpdated;
    }

    public boolean isUserAvailable(String mail, String password) {
        boolean isAvailable = false;
        
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT COUNT(*) FROM users WHERE email=?";

            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, mail);
            ResultSet selectSet = selectStatement.executeQuery();

            if (selectSet.next()) {
                if (selectSet.getInt(1) > 0) {

                    selectSet.close();

                    String passQuery = "SELECT COUNT(*) FROM users WHERE email=? && password=?";
                    PreparedStatement passStatement = connection.prepareStatement(passQuery);
                    passStatement.setString(1, mail);
                    passStatement.setString(2, password);

                    ResultSet passSet = passStatement.executeQuery();

                    if (passSet.next()) {
                        if (passSet.getInt(1) > 0) {
                            isAvailable=true;
                        }
                    }
                    passSet.close();
                    connection.close();

                } 
            }
            connection.close();
            selectSet.close();

        } catch (Exception ex) {
            MessageBox messageBox=new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage() + "!");
        }
        return isAvailable;
    }

}
