package javabank;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AtmOperations {

    private String mail;
    private Component form;

    public AtmOperations(String mail, Component form) {
        this.mail = mail;
        this.form = form;
    }

    public boolean activateAtm() {
        boolean isActivated = false;
        if (!isAlreadyActivated()){

            AccountsTableValues obj1 = new AccountsTableValues(mail, form);
            obj1.assignAccountTableValues("Savings Account");
            int AccNo = obj1.getIntValues("accountNumber");
            try {
                DatabaseConnection con = new DatabaseConnection();
                Connection connection = con.createConnection();
                String insertQuery = "INSERT INTO atm (atmCardNumber,pin,accountNumber,email) VALUES (?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(insertQuery);
                statement.setInt(1, AccNo + 89765);
                statement.setInt(2, (AccNo / 100) + 1234);
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
}
