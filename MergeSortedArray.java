import java.util.*;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]

        int[] nums1b = {1};
        int[] nums2b = {};
        merge(nums1b, 1, nums2b, 0);
        System.out.println(Arrays.toString(nums1b)); // [1]

        int[] nums1c = {0};
        int[] nums2c = {1};
        merge(nums1c, 0, nums2c, 1);
        System.out.println(Arrays.toString(nums1c)); // [1]
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // last real element in nums1
        int j = n - 1;       // last element in nums2
        int k = m + n - 1;   // last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        // if nums2 still has elements left
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}
