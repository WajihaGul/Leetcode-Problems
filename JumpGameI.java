public class JumpGameI {
    public static void main(String[] args) {

        System.out.println(canJump(new int[]{2, 3, 1, 1, 4})); // true
     /*   System.out.println(canJump(new int[]{3, 2, 1, 0, 4})); // false
        System.out.println(canJump(new int[]{0}));              // true  (already at end)
        System.out.println(canJump(new int[]{1, 0}));           // true
        System.out.println(canJump(new int[]{2, 0}));           // true
*/

    }
    public static boolean canJump(int[] nums) {
        int i=0;
        int maxReach = 0;

        while(i<nums.length){
            if(i>maxReach){
                return  false;
            }

            maxReach = Math.max(maxReach,i+nums[i]);

            i++;
        }

        return true;
        }
}
