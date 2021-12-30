package coding;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        //fibonacci with ArrayList whole numbers
        System.out.println(printFibonacci(25));

        //fibonacci last number
        System.out.println(fibonacci1(25));

    }

    //fibonacci with ArrayList whole number
    public static ArrayList<Integer> printFibonacci(int num)
    {
        ArrayList<Integer> fibSeries = new ArrayList<>();
        int f1=0;
        int f2=1;
        int result;
        fibSeries.add(f1);
        fibSeries.add(f2);
        for (int i=0;i<=num-2;i++){
            result= f1+ f2;
            f1= f2;
            f2 = result;
            fibSeries.add(result);
        }
        return fibSeries;
    }


    //fibonacci last number
    public static int fibonacci1(int num) {
        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }

        return result;
    }
}
