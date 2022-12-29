package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class GoodPair {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(uniqueNums(nums));
    }
//-------------------------------------------------------
    public static int numIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

            }
        }
        return count;
    }

    //----------------------------------------------------------
    public static int uniqueNums(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {1, 2, 3, 2};


        for (int x : nums) {
            int count = map.get(x) == null ? 0 : map.get(x);
            map.put(x, count + 1);
        }
        System.out.println(map);
        int sum = 0;
        for (Integer x : map.keySet()) {
            if (map.get(x) == 1) {
                sum = sum + x;
            }
        }
        return sum;

 // ------------------------------------------------------------------------------

        }public static int countConsistentStrings(String allowed, String[] words) {
            allowed = "ab";
            words = new String[]{"ad", "bd", "aaab", "baa", "badab"};
            int count = 0;
            for(String x: words) {
                for(String c: x.split("")) {
                    if(!allowed.contains(c)) {
                        count--;
                        break;
                    }
                }
                count++;
            }
            return count;
    }
}
