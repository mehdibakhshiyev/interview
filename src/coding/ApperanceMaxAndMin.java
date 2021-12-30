package coding;

import java.util.HashMap;

public class ApperanceMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 1, 3, 6, 9, 0, 8, 7, 5, 4, 3, 2, 7, 6, 1, 9, 0, 3,1};

        // Find the number which is appearing maximum number of times
        maxFrequency(arr);

        //Find the number which is appearing minimum number of times
        minFrequency(arr);


    }

    //Find the number which is appearing maximum number of times
    public static void maxFrequency(int[] arr){
        HashMap<Integer, Integer> occur = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(occur.containsKey(arr[i])){
                int a=occur.get(arr[i]);
                a++;
                occur.put(arr[i], a);
            }else{
                occur.put(arr[i], 1);
            }
        }
        int maxFr= 0;
        int numMa = 0;
        for(int num: occur.keySet()){
            if(occur.get(num)>maxFr) {
                maxFr = occur.get(num);
                numMa = num;
            }
        }
        System.out.print("Maximum frequency is "+maxFr);
        System.out.println(" For number "+numMa);
    }

    // Find the number which is appearing minimum number of times
    public static void minFrequency(int[] arr){
        HashMap<Integer, Integer> occur = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(occur.containsKey(arr[i])){
                int a=occur.get(arr[i]);
                a++;
                occur.put(arr[i], a);
            }else{
                occur.put(arr[i], 1);
            }
        }
        int min=999;
        int numm= 0;
        for (int number:occur.keySet()){
            if(occur.get(number)<=min){
                min=occur.get(number);
                numm= number;
            }
        }
        System.out.println(numm+" appearing "+ min);
    }
}
