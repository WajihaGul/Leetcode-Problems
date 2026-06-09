public class JumpGameII {
    public static void main(String[] args) {

        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));    // 2
     /*   System.out.println(jump(new int[]{2, 3, 0, 1, 4}));    // 2
        System.out.println(jump(new int[]{1, 2, 1, 1, 1}));    // 3
        System.out.println(jump(new int[]{0}));                  // 0  (already at end)
    */}
    public static int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int maxReach = 0;
        int currentEnd = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == currentEnd) {          // exhausted current jump's range
                jumps++;                     // must take another jump
                currentEnd = maxReach;       // extend range

                if (currentEnd >= nums.length - 1) return jumps;
            }
        }

        return jumps;
    }
}
