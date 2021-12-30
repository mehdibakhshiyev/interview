package coding;

public class MaxAndMinInArr {
    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 2, 1, 3, 6, 9, 0, 8, 7, 5, 4, 3, 2, 7, 6, 1, 9, 0, 3,1};

        //Maximum number in Array
        System.out.println(maximumInArray(arr));

        //Minimum number in Array
        System.out.println(minimumInArray(arr));
    }

    // Maximum number in Array
    public static int maximumInArray(int[] arr){
        int max =0;
        for(int numb:arr)
        {
            if(numb>max)
                max = numb;
        }
        System.out.print("Maximum in array ");
        return max;
    }

    //Minimum number in Array
    public static int minimumInArray(int[] arr){
        int mini=0;
        for(int numb:arr)
        {
            if(numb<mini)
                mini = numb;
        }
        System.out.print("Minimum in array ");
        return mini;
    }
}
