import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums)); // 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums2)); // 2

        int[] nums3 = {1};
        System.out.println(majorityElement(nums3)); // 1
    }
    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i])>nums.length/2){
                // if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
       /* int maxCount = 0;
        int count =0;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
            }
            if(maxCount>nums.length/2){
                return nums[i];
            }
            count = 0;
        }
        return -1 ;*/
    }
}
