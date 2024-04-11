package src.LogicOperators;

import javax.swing.*;

public class TestTernar {
    public static void main(String[] args) {
        int numberDay = Integer.parseInt(JOptionPane.showInputDialog("Введите номер дня недели"));
        System.out.println(numberDay > 0 && numberDay < 8 ?
                (numberDay > 0 && numberDay < 6? "будний день" : "выходной день") :
                "некорректный день");

 //       Задача
        int a = 10;
        int b = a >= 10 ? ++a + 2 : a--;
        //int b = a >= 10 ? ((a > 15) ? 1 : 0) : -1;
        System.out.println(b);

    }

}
