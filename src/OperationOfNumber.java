package src;

import javax.swing.JOptionPane;

public class OperationOfNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Input first number"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Input second number"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Input third number"));
        System.out.println(a*2+" "+b/3+" "+c*c);
        System.out.println((a*2)+(b/3)+(c*c));
    }
}
