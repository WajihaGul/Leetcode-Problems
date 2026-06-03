import java.util.*;

public class FourSum {
        public static void main(String[] args) {
/*
        // Test 1: Expected: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        System.out.println("Test 1: " + fourSum(nums1, 0));

        // Test 2: Expected: [[2,2,2,2]]
        int[] nums2 = {2, 2, 2, 2, 2};
        System.out.println("Test 2: " + fourSum(nums2, 8));

        // Test 3: Expected: []
        int[] nums3 = {1, 2, 3, 4};
        System.out.println("Test 3: " + fourSum(nums3, 100));

        // Test 4: large negative target — Expected: [[-3,-2,-2,-1]]
        int[] nums4 = {-3, -2, -2, -1, 0};
        System.out.println("Test 4: " + fourSum(nums4, -8));

        // Test 5: overflow check with large values — Expected: [[1000000000,1000000000,1000000000,1000000000]]
        int[] nums5 = {1000000000, 1000000000, 1000000000, 1000000000};
        System.out.println("Test 5: " + fourSum(nums5, 2147483647));
*/
        int[] nums6 = {1000000000,1000000000,1000000000,1000000000};
        System.out.println("Test 5: " + fourSum(nums6, -294967296));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        int left =0;
        int right = nums.length-1;
        long sum = -1;
        long longTarget = (long)target;

        for(int i=0;i< nums.length-3;i++){
            for(int j = i+1;j< nums.length-2;j++){
                left = j+1;
                right = nums.length-1;
                while (left<right){
                    sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum>longTarget){
                        right--;
                    }
                    else if(sum<longTarget){
                        left++;
                    }
                    else if(sum == longTarget){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                }
            }
        }

       /*	Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();

		int i = 0;
		int j = i + 1;
		int k = j + 1;
		int right = nums.length - 1;   // b was 'l', now unambiguous

		while (k < right && i <= nums.length - 4 && j <= nums.length - 3) {
            long tempSum = (long) nums[i] + nums[j] + nums[k] + nums[right];
            long longTarget = (long) target;

			if (tempSum < longTarget) {
				k++;
			} else if (tempSum > longTarget) {
				right--;
			} else {
				result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[right]));
				k++;
				right--;
			}

		      if (k >= right) {
                j++;
                if (j > nums.length - 3) {   // j exhausted → advance i immediately
                    i++;
                    j = i + 1;
                }
                k = j + 1;
                right = nums.length - 1;
            }
            
		}
*/
		return new ArrayList<>(result);
    }
}
