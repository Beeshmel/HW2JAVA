package src;

import java.util.concurrent.ThreadLocalRandom;

public class RandomSumm {
    public static void main(String[] args){
        long a = ThreadLocalRandom.current().nextLong(-1000,1000);
        long b = ThreadLocalRandom.current().nextLong(-1000,1000);
        System.out.println("a = " + a + "\nb = " + b);

        if (a>0 && b>0)
            { System.out.println("Разность a-b=" + (a-b)); }
        else
        {   if (a<0 && b<0)
                { System.out.println("Произведение a*b=" + (a*b));}
            else {System.out.println("Сумма a+b=" + (a+b));}
        }
    }
}
