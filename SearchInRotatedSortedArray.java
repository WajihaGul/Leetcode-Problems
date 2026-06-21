import java.util.Arrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        System.out.println("Test 1: " + search(nums1, target1)); // expected: 4

        int[] nums2 = {7,8,9,0,1,2,3,4,5,6};
        int target2 = 8;
        System.out.println("Test 2: " + search(nums2, target2)); // expected: 1

        int[] nums3 = {4,5,6,7,0,1,2};
        int target3 = 3;
        System.out.println("Test 3: " + search(nums3, target3)); // expected: -1

        int[] nums4 = {1};
        int target4 = 0;
        System.out.println("Test 4: " + search(nums4, target4)); // expected: -1

        int[] nums5 = {1,2,3,4,5};
        int target5 = 5;
        System.out.println("Test 5: " + search(nums5, target5)); // expected: 4
    }

    public static int search(int[] nums, int target) {
        return getMid(nums, 0, nums.length - 1, target);
    }

    public static int getMid(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + ((right - left) / 2);

        if (nums[mid] == target) {
            return mid;
        }

        // Left half sorted hai
        if (nums[left] <= nums[mid]) {
            // Target left half ki range mein hai?
            if (nums[left] <= target && target < nums[mid]) {
                return getMid(nums, left, mid - 1, target);  // left jao
            } else {
                return getMid(nums, mid + 1, right, target); // right jao
            }
        }
        // Right half sorted hai
        else {
            // Target right half ki range mein hai?
            if (nums[mid] < target && target <= nums[right]) {
                return getMid(nums, mid + 1, right, target); // right jao
            } else {
                return getMid(nums, left, mid - 1, target);  // left jao
            }
        }
    }
}