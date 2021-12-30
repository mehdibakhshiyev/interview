package coding;

public class Palindrome {
    public static void main(String[] args) {

        // palindrome string
        String word = "civic";
        System.out.println(palindrome1(word));

        //palindrome with string buffer
        String word2 = "Kylie";
        System.out.println(palindromeStringBuffer(word2));

        //palindrome integer
        int num = 1234321;
        System.out.println(isPalindrome(num));
    }

    // palindrome string
    public static boolean palindrome1(String str1) {
        String str2 = "" ;
        for ( int i= str1.length()- 1 ; i>= 0 ;i--)
            str2 += str1.charAt(i);
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(str1 + " is a palindrome" + " Here is the reversed = " + str2);
            return true;
        } else {
            System.out.println(str1 + " is NOT a palindrome!" + " Here is the reversed = " + str2);
            return false;
        }
    }

    //palindrome with string buffer
    public static boolean palindromeStringBuffer(String str1) {

        String str2 = new StringBuffer(str1).reverse().toString();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(str1 + " is a palindrome" + " Here is the reversed = " + str2);
            return true;
        } else {
            System.out.println(str1 + " is NOT a palindrome!" + " Here is the reversed = " + str2);
            return false;
        }
    }


    //palindrome integer
    public static boolean isPalindrome(int number) {
        int reverse = 0; // 43
        int temp = number; // 123

        while (temp != 0) {

            int lastDigit = temp % 10; // 3
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
            // System.out.println(reverse);
        }
        return reverse == number;
    }

    public static void isPalindrome2(int num) {
        int reversed = 0, remainder, originalNum;

        originalNum = num;
        for (; num != 0; num /= 10) {
            remainder = num % 10;
            reversed = remainder * 10 + remainder;
        }
    }
}
