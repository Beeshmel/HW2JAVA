package src;
import javax.swing.*;

public class MetrToKilometr {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Input meter"));
        System.out.println(a/1000+" km");
    }
}
