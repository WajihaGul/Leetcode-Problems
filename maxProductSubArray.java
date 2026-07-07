public class maxProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));

        int[] nums1 = {2, 3, 3, -2, 4};
        System.out.println(maxProduct(nums1));

        int[] nums2 = {-2, 0, -1};
        System.out.println(maxProduct(nums2));

        int[] nums3 = {-2};
        System.out.println(maxProduct(nums3));

        int[] nums4 = {0,2};
        System.out.println(maxProduct(nums4));

        int[] nums5 = {-4,-3};
        System.out.println(maxProduct(nums5));

        int[] nums6 = {-2,3,-4};
        System.out.println(maxProduct(nums6));
    }

        public static int maxProduct(int[] nums) {
            int max = nums[0];
            int min = nums[0];
            int result = nums[0];

            for (int i = 1; i < nums.length; i++) {

                if (nums[i] < 0) {
                    // negative aaya, swap karo
                    int temp = max;
                    max = min;
                    min = temp;
                }

                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);

                result = Math.max(result, max);
            }

            return result;
        }
    }

