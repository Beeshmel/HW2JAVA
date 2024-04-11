package src;

public class DemoMath {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(9));//корень из 9
//        System.out.println(Math.pow(2,3));//8
//        System.out.println(Math.pow(8.0,1.0/3.0));

//        System.out.println(Math.round(2.76));//округление по правилам математики до целого числа
//        System.out.println(Math.ceil(2.0001));//округление вверх
//        System.out.println(Math.floor(2.99999));//округление вниз

//        System.out.println(Math.PI);

//        Нахождение рандомных чисел

        System.out.println(Math.random());//Получаем случайное число в отрезке [0,1)
//        Для получения случайного числа на произвольном отрезке используйте формулу
//        Math.random() * (max - min) + min
//    [1,10)
//        System.out.println((int)(Math.random() * 9 + 1));

//        System.out.println(Math.random() * 15);//[0,15)
//        [-10,5)

//        System.out.println((int)(Math.random()*6+2));
//        System.out.println((int)(Math.random() * 15 - 10));

        System.out.println(Math.abs(-5));

        int age1 = (int) (Math.random() * 45 + 20);
        int age2 = (int) (Math.random() * 45 + 20);
        int age3 = (int) (Math.random() * 45 + 20);

        int maxAge = Math.max(Math.max(age1,age2),age3);
        int minAge = Math.min(Math.min(age1,age2),age3);
        int middleAge = age1 + age2 + age3 - maxAge - minAge;

        System.out.printf("%d %d %d",minAge,middleAge,maxAge);


    }
}
