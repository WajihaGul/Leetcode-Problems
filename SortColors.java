import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums)); // [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2)); // [0, 1, 2]

        int[] nums3 = {0};
        sortColors(nums3);
        System.out.println(Arrays.toString(nums3)); // [0]*/
    }
    public static int[] sortColors(int[] nums) {
        int oneP = 0;
        int left = 0;
        int right = nums.length - 1;

        while (oneP <= right) {
            if (nums[oneP] == 2) {
                int temp = nums[oneP];
                nums[oneP] = nums[right];
                nums[right] = temp;
                right--;
            } else if (nums[oneP] == 0) {
                int temp = nums[oneP];
                nums[oneP] = nums[left];
                nums[left] = temp;
                left++;
                oneP++;
            } else if (nums[oneP] == 1){
                oneP++;
            }
    }
        return nums;
    }
    /*public static void sortColors(int[] nums) {


        //let swap zero first
        int left = 0;
        int right = nums.length-1;
        int i=0;

        while(i<=right && i<nums.length){
            if(nums[i]==0){
                //if(nums[left]!=0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
                i++;
                //    }
            }
            else if(nums[i]==2){
                //if(nums[left]!=2){
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
                //}
            }
            else{
                i++;
            }
        }
    }*/
}
