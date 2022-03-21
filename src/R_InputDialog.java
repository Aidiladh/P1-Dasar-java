import javax.swing.*;

public class R_InputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Wha is your name?");
        System.out.println("My name is "+name);
        System.exit(0);
    }
}
