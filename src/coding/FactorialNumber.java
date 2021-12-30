package coding;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorialNum(num));
    }


    // factorial num
    public static int factorialNum(int n) {
        
        int result = 1;

        for (int i = 1; i <=n; i++) {

            result = result * i;
        }

        return result;
    }
}
