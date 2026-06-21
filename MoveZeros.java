import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
        /*int[] nums ={1,0};
        moveZeroes(nums);

        int[] nums2 ={1,0,1};
        moveZeroes(nums2);

        int[] nums3 ={0,1,0,3,12};
        moveZeroes(nums3);*/

        int[] nums4 ={0,1,0};
        moveZeroes(nums4);
    }
    public static void moveZeroes(int[] nums) {
       int left = 0;
       int z = -1;
       int right = nums.length-1;
       
       while(left<=right){
           if(nums[left] == 0 && z<0){
               z = left;
               left++;
           }
           else if(nums[left] == 0 && nums[z]!=0){
               z = left;
               left++;
           }else if (nums[left] != 0 && z>=0) {
               int temp = nums[left];
               nums[left] = nums[z];
               nums[z] = temp;
               z++;
               left++;
           } else if (nums[left] == 0 && z>=0 && nums[z]==0) {
               left++;
           }
          else{
               left++;
           }
       }
       System.out.println(Arrays.toString(nums));
    }
}
