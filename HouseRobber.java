public class HouseRobber {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int res = rob(nums1);
        System.out.println(res);

      /*  int[] nums2 = {2,7,9,3,1};
        int res2 = rob(nums2);
        System.out.println(res2);*/


    }

    public static int rob(int[] nums) {
        int leftSum = 0;
        int left = 0;

        if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        if (nums[0] > nums[1]) {
            leftSum = nums[0];
            left = 0;
        } else {
            leftSum = nums[1];
            left = 1;
        }
        int i = left + 2;
        int j = left + 3;

        while (left < nums.length) {
            if (i< nums.length && nums[i] >= nums[j]) {
                leftSum += nums[i];

            } else if (j< nums.length && nums[j] > nums[i]) {
                leftSum += nums[j];
            }
            else{

            }
            i += 2;
            j += 2;
        }
        return leftSum;

       /* int sum1 = 0;
        int sum2 = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length; i++){
            if(i%2 == 0){
                sum1 += nums[i];
            }
            else{
                sum2 += nums[i];
            }
        }
        maxSum = Math.max(sum1,sum2);
        return maxSum;*/
    }
}