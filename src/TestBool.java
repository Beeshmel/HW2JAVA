package src;

import javax.swing.*;

public class TestBool {
    public static void main(String[] args) {
        int numberDay = Integer.parseInt(JOptionPane.showInputDialog("Введите номер дня недели"));
        boolean isWorkDay = numberDay > 0 && numberDay < 6;
        boolean isWeekend = numberDay == 6 || numberDay == 7;
        System.out.println("День №" + numberDay + " будний день? Ответ " + isWorkDay);
        System.out.println("День №" + numberDay + " выходной день? Ответ " + isWeekend);
    }
}
