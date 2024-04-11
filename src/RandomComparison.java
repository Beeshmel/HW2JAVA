package src;

public class RandomComparison {
    public static void main(String[] args){
        int a = (int) (Math.random()*(1000)+0);
        int b = (int) (Math.random()*(1000-0)+0);
        System.out.println("a = " + a + "\nb = " + b);
        int c = a-b;
        if (c>0){
            System.out.println("Число a больше b на " + c);
        }else {
            if (c<0){
                System.out.println("Число b больше a на " + Math.abs(c));}
            else{
                System.out.println("Числа равны");
            }
        }
    }
}
