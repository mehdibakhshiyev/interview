package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Mapping {
    public static void main(String[] args) {
        // Arraylist - same as array but organized very well for easy use, ordered
        // HashSet = it is also like list but it doesn't allow duplicate, unorderd
        // HashMap = it is key value pair, unordered

        // List of students in class
        // add, get, size, clear, remove
        ArrayList<String> names = new ArrayList<>();
        names.add("RK");
        names.add("Ra");
        names.add("JK");
        System.out.println(names.get(0));
        names.contains("RK");


        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }

        for(String name:names)
        {
            System.out.println(name);
        }

        // List of blood group of students in class

        HashSet<String> bloodGroups = new HashSet<>();
        bloodGroups.add("AB+");
        bloodGroups.add("B+");
        bloodGroups.add("A+");
        bloodGroups.add("AB+");
        bloodGroups.add("B+");

        System.out.println(bloodGroups.toString());
        int countSet = 0;
        for(String bloodGroup:bloodGroups)
        {
            System.out.println(bloodGroup);
            countSet++;
        }
        System.out.println("Size "+countSet);
        // HashMap for students and their groups

        HashMap<String,Integer> bgCount = new HashMap<>();
        bgCount.put("AB+",8);
        bgCount.put("A+",9);
        bgCount.put("B+",13);
        System.out.println(bgCount);
        bgCount.size();
        bgCount.get("A+");
        bgCount.put("AB+",89);
        System.out.println(bgCount.keySet());
        for(String bg:bgCount.keySet())
        {
            System.out.println("Key = "+bg+", value = "+bgCount.get(bg));
        }
    }
}
