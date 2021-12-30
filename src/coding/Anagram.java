package coding;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "art";
        String str2 = "rat";
        String str11 = "" ;
        String str22 = "" ;
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort (ch1);
        Arrays.sort (ch2);
        for ( char each:ch1) {
            str11+=each;
        }
        for ( char each:ch2) {
            str22+=each;
        }
        System.out.println(str11.equals(str22)? "Anagram" : "NOT Anagram" );

        //anagram approach 2
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str1.equals(str2)? "Anagram 2nd approach" : "NOT Anagram 2 approach" );
    }
}