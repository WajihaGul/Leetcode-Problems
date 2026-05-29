import java.util.Arrays;

public class ThreeSumCloset {
        public static void main(String[] args) {

        // Test 1: Expected 2
        int[] nums1 = {-1, 2, 1, -4};
        System.out.println("Test 1: " + threeSumClosest(nums1, 1));

        // Test 2: Expected 0
        int[] nums2 = {0, 0, 0};
        System.out.println("Test 2: " + threeSumClosest(nums2, 1));

        // Test 3: Expected 3 (exact match)
        int[] nums3 = {1, 1, 1, 0};
        System.out.println("Test 3: " + threeSumClosest(nums3, 3));

        // Test 4: Expected -4
        int[] nums4 = {-5, -3, -1, 2};
        System.out.println("Test 4: " + threeSumClosest(nums4, -10));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2]; // initial guess

        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right){
                int tempSum = nums[i]+nums[left]+nums[right];
                
                if (Math.abs(tempSum - target) < Math.abs(closest - target)) {
                    closest = tempSum;  // works whether sum is bigger or smaller than target
                }
                
                if (tempSum < target) {
                    left++;        // sum too small, need bigger value
                } else if (tempSum > target) {
                    right--;       // sum too big, need smaller value
                } else {
                    return tempSum; // exact match, can't get better
                }
                
            }
            
        }
        return closest;
    }
}
