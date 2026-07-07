public class SubArrayProductLessThanK
{
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        int res = numSubarrayProductLessThanK(nums,k);
        System.out.println(res);

        int[] nums2 = {1,2,3};
        int k2 = 0;
        int res2 = numSubarrayProductLessThanK(nums2,k2);
        System.out.println(res2);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for(int i = 0;i<nums.length; i++){
            if(nums[i]<k){
                count++;
            }
        }

        for(int i = 0;i<nums.length; i++){
            int product = nums[i];
            for(int j = i+1; j<nums.length;j++){
                product *= nums[j];
                if(product <k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
