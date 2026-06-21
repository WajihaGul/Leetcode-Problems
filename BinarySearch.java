import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
       /* int[] nums = {2, 5};
        int target = 5;
        int res = search(nums,target);
        System.out.println(res); // 1
*/
        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;
        int res2 = search(nums2,target2);
        System.out.println(res2); // 1
/*
        int[] nums3 = {1};
        System.out.println(singleNumber(nums3)); // 1

 */   }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = ((left+right)/2)+1;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid]>target){
            left = 0;
            right = mid;

            while(left<right){
                if(nums[left]<target){
                    left++;
                }
                else if(nums[left]>target){
                    right--;
                }
                else if(nums[left]==target){
                    return left;
                }
            }


            /*for(int i = 0;i<mid;i++){
                if(nums[i]== target){
                    return i;
                }
            }*/
        }
        else if(nums[mid]<=target){
            left = mid;
            right = nums.length-1;

            while(left<right){
                if(nums[left]<target){
                    left++;
                }
                else if(nums[left]>target){
                    right--;
                }
                else if(nums[left]==target){
                    return left;
                }
            }
            /*for(int i = mid;i<nums.length;i++){
                if(nums[i]== target){
                    return i;
                }
            }*/
        }
        return -1;
    }
}
