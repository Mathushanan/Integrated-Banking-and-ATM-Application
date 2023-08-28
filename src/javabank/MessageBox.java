
package javabank;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Component;

public class MessageBox {
    public void getMessageBoxInfo(Component form,String message){
        
        SwingUtilities.invokeLater(() -> {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(
                        form,
                        message,
                        "Information!",
                        JOptionPane.INFORMATION_MESSAGE
                );
            });
    }
    public void getMessageBoxWar(Component form,String message){
        
        SwingUtilities.invokeLater(() -> {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(
                        form,
                        message,
                        "Warning!",
                        JOptionPane.WARNING_MESSAGE
                );
            });
    }
    public void getMessageBoxErr(Component form,String message){
        
        SwingUtilities.invokeLater(() -> {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(
                        form,
                        message,
                        "Error!",
                        JOptionPane.ERROR_MESSAGE
                );
            });
    }
    
}
