package src.LogicOperators;

import javax.swing.*;

public class DemoSwitch {
    public static void main(String[] args) {
        String svetophor = JOptionPane.showInputDialog("Введите цвет светофора (red,green,yellow)");
        switch (svetophor) {
            case "red":
                System.out.println("Стоп");
                break;
            case "green":
                System.out.println("Вперед");
                break;
            case "yellow":
                System.out.println("Внимание");
                break;
            default:
                System.out.println("Поломка светофора");
        }

/*        Задача. Введите число от 1 до 5. Необходимо вывести
        все числа от введенного числа до 5*/

        int number = Integer.parseInt(JOptionPane.showInputDialog("Введите цифру от 1 до 5"));
        switch (number) {
            case 1:
                System.out.println("1 2 3 4 5");
                break;
            case 2:
                System.out.println("2 3 4 5");
                break;
            case 3:
                System.out.println("3 4 5");
                break;
            case 4:
                System.out.println("4 5");
                break;
            case 5:
                System.out.println("5");
                break;

        }

        switch (number) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);

        }
    }
}


