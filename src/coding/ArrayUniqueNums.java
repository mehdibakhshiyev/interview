package coding;

import java.util.HashSet;
import java.util.Set;

public class ArrayUniqueNums {

    public static void main(String[] args) {
        // 1st way
        int[] nums = new int[6];
        nums[0] = 44;
        nums[1] = 32;
        nums[2] = 100;
        nums[3] = 100;
        nums[4] = 7;
        nums[5] = 7;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println(set);

        // 2nd way
        String uniqNums = "";
        for (int n : nums) {
            if (!uniqNums.contains(String.valueOf(n)))
                uniqNums = uniqNums + n + " ";
        }
        System.out.println(uniqNums);
    }
}
