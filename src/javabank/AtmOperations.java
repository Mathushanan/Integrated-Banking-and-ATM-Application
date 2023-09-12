package javabank;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class AtmOperations {

    private String mail;
    private Component form;

    public AtmOperations(String mail, Component form) {
        this.mail = mail;
        this.form = form;
    }

    public boolean activateAtm() {
        boolean isActivated = false;
        if (!isAlreadyActivated()) {

            AccountsTableValues obj1 = new AccountsTableValues(mail, form);
            obj1.assignAccountTableValues("Savings Account");
            int AccNo = obj1.getIntValues("accountNumber");
            try {
                DatabaseConnection con = new DatabaseConnection();
                Connection connection = con.createConnection();
                String insertQuery = "INSERT INTO atm (atmCardNumber,pin,accountNumber,email) VALUES (?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(insertQuery);
                statement.setInt(1, AccNo + 89765);

                Random random = new Random();
                int num = random.nextInt(9000) + 1000;
                while (isAtmPinExit(num)) {
                    num = random.nextInt(9000) + 1000;
                }
                statement.setInt(2, num);
                statement.setInt(3, AccNo);
                statement.setString(4, mail);

                if (statement.executeUpdate() > 0) {
                    isActivated = true;
                }
                connection.close();
            } catch (Exception ex) {
                MessageBox messageBox = new MessageBox();
                messageBox.getMessageBoxErr(form, ex.getMessage());
            }

        }

        return isActivated;
    }

    public boolean isAlreadyActivated() {
        boolean isActivated = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT COUNT(*) FROM atm WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);

            ResultSet set = statement.executeQuery();
            int count = 0;
            if (set.next()) {
                count = set.getInt(1);
            }
            if (count > 0) {
                isActivated = true;
            }
            set.close();
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isActivated;
    }

    public int getAtmPin() {
        int pin = 0;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT pin FROM atm WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);

            ResultSet set = statement.executeQuery();
            if (set.next()) {
                pin = set.getInt("pin");
            }
            set.close();
            connection.close();
        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return pin;

    }

    public boolean isAtmPinExit(int pin) {
        boolean isExit = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT COUNT(*) FROM atm WHERE pin=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setInt(1, pin);

            ResultSet set = statement.executeQuery();
            if (set.next()) {
                if (set.getInt(1) > 0) {
                    isExit = true;
                }
            }
            set.close();
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isExit;
    }

    public boolean isValidPin(int pin) {
        boolean isValid = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT COUNT(*) FROM atm WHERE email=? && pin=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);
            statement.setInt(2, pin);

            ResultSet set = statement.executeQuery();
            if (set.next()) {
                if (set.getInt(1) > 0) {
                    isValid = true;
                }
            }
            set.close();
            connection.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(form, ex.getMessage());
        }
        return isValid;
    }

    public boolean updateAtmPin(int pin) {
        boolean isUpdated = false;
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String updateQuery = "UPDATE atm SET pin=? WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(updateQuery);
            statement.setInt(1, pin);
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
}
