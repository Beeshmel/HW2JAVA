package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class DemoScanner {
//    Существует 2 вида методов - статические и нестатические.
//    Статические вызываем по имени класса, а нестатические по имени объекта.
//    Для создания объекта класса используйте формулу:
//    Имя_класса имя_объекта = new Имя_Класса(параметры, если они допустимы);

    public static void main(String[] args) throws IOException {
//        int x;
//        if(true){
//            x = 10;
//        }
//        System.out.println(x);

        Scanner sc = new Scanner(System.in);//сделали объект класса
        System.out.println("Введите Ваше имя и отчество");
        String fio = sc.nextLine();//получение введенного строкового значения до 1го пробела
        System.out.println("Введите возраст");
        if(sc.hasNextInt()) {//если ввели именно целое число
            int age = sc.nextInt();//если с консоли считываем целое число, то nextInt
            System.out.println(fio + ", вы родились в " + (LocalDate.now().getYear() - age));
        }else {
            System.out.println("Вы ввели некорректный возраст");
        }

//        var reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Добрый день" + reader.readLine());



        /*
        * String[] options = {"Red", "Yellow", "Green"};

        int x = JOptionPane.showOptionDialog(null, "Choose traffic light color.",
                "click it! :)",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);

        * */
    }
}
