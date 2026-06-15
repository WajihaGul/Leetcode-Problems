import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] t1 = {1, 2, 3, 4};   // Output: [24,12,8,6]
        int[] res1 = productExceptSelf(t1);
        System.out.println(Arrays.toString(res1));
        /*
        int[] t2 = {-1, 1, 0, -3, 3};   //  Output: [0,0,9,0,0]
        int[] res2 = productExceptSelf(t2);
        System.out.println(Arrays.toString(res2));

        int[] t3 = {0, 0};   //  Output: [0,0]
        int[] res3 = productExceptSelf(t3);
        System.out.println(Arrays.toString(res3));
    */}

    public static int[] productExceptSelf(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] res = new int[nums.length];

        //left array
        leftSum[0] = 1;
        for (int l = 1; l < leftSum.length; l++) {
            leftSum[l] = leftSum[l-1] * nums[l-1];
        }

        //right array
        rightSum[rightSum.length-1] = 1;
        for (int r = rightSum.length-2;r>=0; r--) {
            rightSum[r] = rightSum[r+1] * nums[r+1];
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = leftSum[i] * rightSum[i];
        }

        return  res;
    }

}