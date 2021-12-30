package coding;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueValues {
    public static void main(String[] args) {
        String str = "aaabbcccdddeereeegggg";
// 1st print only unique values from string
        Set<Character> setC = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            setC.add(str.charAt(i));
        }
        System.out.println(setC);
// 2nd print only unique values from string
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i) + "")) {
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);
    }
}

