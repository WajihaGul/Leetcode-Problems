public class TwoSum {
 
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]"); // Expected: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]"); // Expected: [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        int i= 0;
        int j = i+1;
        int n= nums.length;
        
        while(i<n && j<n){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
            else if(j<n-1){
               j++; 
            }
            else{
                i++;
                j=i+1;
            }
        }
    return new int[]{-1,-1};
    }
    
}