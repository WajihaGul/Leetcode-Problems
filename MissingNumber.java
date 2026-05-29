public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int j = nums.length;
        int tempSum = 0;

        while(j != 0){
            tempSum += j;
            j--;
        }

        for(int i=0;i<nums.length;i++){
            tempSum -= nums[i];
        }
        return tempSum;
    }
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums)); // 2

        int[] nums2 = {0, 1};
        System.out.println(missingNumber(nums2)); // 2

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums3)); // 8
    }
}
