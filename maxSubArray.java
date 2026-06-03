public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // 6

        int[] nums2 = {1};
        System.out.println(maxSubArray(nums2)); // 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(nums3)); // 23

        int[] nums4 = {-1, -2, -3};
        System.out.println(maxSubArray(nums4)); // -1
    }

    public static int maxSubArray(int[] nums) {
        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            tempSum += nums[i];
            maxSum = Math.max(tempSum,maxSum);

           if(tempSum<0){
                tempSum = 0;
            }
        }
        return maxSum;
    }
}
