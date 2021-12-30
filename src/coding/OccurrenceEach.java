package coding;

import java.util.HashMap;

public class OccurrenceEach {
    public static void main(String[] args) {

        // occurrence each char in String
        String str = "my name is java";
        System.out.println(occurrEachChar(str));

        // occurrence each number in Array
        int[] arr = {5, 3, 7, 2, 1, 3, 6, 9, 0, 8, 7, 5, 4, 3, 2, 7, 6, 1, 9, 0, 3, 1};
        System.out.println(occurrEachNumb(arr));
    }

    //occurrence each number in Array
    public static HashMap occurrEachNumb(int[] arr) {
        HashMap<Integer, Integer> occur = new HashMap<>(); // {(5,1)}
        for (int i = 0; i < arr.length; i++) {
            if (occur.containsKey(arr[i])) {
                int a = occur.get(arr[i]);
                a++;
                occur.put(arr[i], a);
            } else {
                occur.put(arr[i], 1);
            }
        }
        return occur;
    }

    // occurrence each char in String
    public static HashMap occurrEachChar(String str) {

        str = str.replace(" ", "");
        char[] word = str.toCharArray();
        HashMap<Character, Integer> oc = new HashMap<>();

        for (int i = 0; i < word.length; i++) {
            if (oc.containsKey(word[i])) {
                int b = oc.get(word[i]);
                b++;
                oc.put(word[i], b);
            } else {
                oc.put(word[i], 1);
            }
        }
        return oc;
    }
}
