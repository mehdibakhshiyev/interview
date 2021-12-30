package coding;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        //reverse array
        int [] arr1 = {1, 2, 3, 5, 6};
        System.out.println(Arrays.toString(reverseArr(arr1)));

        //reverse integer
        int num = 5350;
        System.out.println(reverseInt(num));

        //reverse string
        String name = "Mehdi";
        System.out.println(strReverse(name));

        //reverse sentence
        String sentence = "Hello, my name is Ravan.";
        System.out.println(reverseSentence(sentence));

        //reverse with String Buffer
        String str1 = "Tesla";
        System.out.println(reverseStrBuffer(str1));

        String random = "heyva";

        System.out.println(random.substring(0, 1).toUpperCase() + random.substring(1));



    }
       /*
    write a function that can array reverse
     */

    public static int[] reverseArr(int[] arr){

        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }

    // reverse integer

    public static int reverseInt(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

    // reverse string

    public static String strReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;

    }

    //reverse second word

    public String reverseSecondWord(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words[1].length() - 1; i >= 0; i--){
            reversed += words[1].charAt(i);
        }

        words[1] = reversed;
        String result = "";

        for (String each : words) {
            result += each + " ";
        }

        return result.trim();
    }


    //reverse sentence
    public static String reverseSentence(String sentence) {
        String reversedSentence = "" ;
        String [] sentenceArray = sentence.split( " " );
        for ( int i = sentenceArray. length - 1 ; i>= 0 ; i--) {
            reversedSentence += sentenceArray[i]+ " " ; }
        reversedSentence = reversedSentence.trim();

        return reversedSentence;
    }


    //reverse with String Buffer
    public static String reverseStrBuffer(String str1) {

        String str2 = new StringBuffer(str1).reverse().toString();
        return str2;
    }
}
