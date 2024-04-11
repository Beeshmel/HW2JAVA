package src;

import javax.swing.*;
import java.time.Year;

public class WorkToPension {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Input your birth of year"));
        int nowyear = Year.now().getValue();

        JOptionPane.showMessageDialog(null,"Your age "+(nowyear-year)+"\nYour time work to Peinsion "+(65-(nowyear-year)));
    
	
	}
}
