import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums)); // 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums2)); // 4

        int[] nums3 = {1};
        System.out.println(singleNumber(nums3)); // 1
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;  // Return the element that occurs only once
            }
        }
        return -1;
    }

}
