package src;

import java.util.Scanner;
//Определение стоимости звонка в будний и выходной день
public class CallCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите стоимость звонка в будние");
        float cost =sc.nextFloat();
        System.out.println("Введите день недели для определения стоимости звонка");
        int day = sc.nextInt();
        if (day > 0 && day < 6) {
            System.out.println("Звонок стоит:" + cost);
        } else {
            if (day > 5 && day < 8) {
                System.out.println("Звонок стоит:" + cost*8/10);
                          } else {
                System.out.println("Некорректный номер недели");
            }
        }
    }
}