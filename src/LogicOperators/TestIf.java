package src.LogicOperators;

import javax.swing.*;
import java.time.LocalDate;

public class TestIf {
    public static void main(String[] args) {
        int numberDay = Integer.parseInt(JOptionPane.showInputDialog("Введите номер дня недели"));
//        1ый вариант
        if (numberDay > 0 && numberDay < 8) {//проверили день на корректный ввод
            if (numberDay > 0 && numberDay < 6) {
                System.out.println("Будний день");
            } else {
                System.out.println("Выходной день");
            }
        } else {
            System.out.println("Вы ввели некорректный день недели");
        }


//        2ой вариант решения
        if (numberDay > 0 && numberDay < 6) {
            System.out.println("Будний день");
        } else if (numberDay == 6 || numberDay == 7) {
            System.out.println("Выходной день");
        }else {
            System.out.println("Некорректный день");
        }

//        3ий способ
        boolean isWorkDay = numberDay > 0 && numberDay < 6;
        boolean isWeekend = numberDay == 6 || numberDay == 7;
        if(isWorkDay){//проверка на true
            System.out.println("Будний день");
        }

        if(!isWeekend){//проверка на будний день
            if(isWorkDay){//проверка на true
                System.out.println("Будний день");
            }else{
                System.out.println("Некорректный день");
            }
        }

//      Проверка текущего года на четность и високосность(кратность на 4)
        int currentYear = LocalDate.now().getYear();
        //проверка года на високосность
        if(currentYear % 4 == 0){
            System.out.println("Високосный год");
        }
        if(currentYear > 2000){
            System.out.println("21 век");
        }else {
            System.out.println("не 21 век");
        }


/*        Задача - есть стоимость покупки. Если цена покупки составляет более 500 руб,
        то скидка 5%, а иначе если стоимость покупки больше 1000, то скидка 10%.
        Вывести конечную стоимость товара*/

        int cost = Integer.parseInt(JOptionPane.showInputDialog("Введите номер дня недели"));
        if(cost > 500 && cost <= 1000){//1200
            cost -= cost * 5 / 100;//стоимость с учетом скидки
        }
        else if(cost > 1000){
            cost -= cost * 10 / 100;
        }

        if(cost > 1000){
            cost -= cost * 10 / 100;
        } else if(cost > 500){
            cost -= cost * 10 / 100;
        }

        System.out.println(cost);

    }
}
