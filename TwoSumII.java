public class TwoSumII {
    public static void main(String[] args) {

        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(numbers1, target1);
        System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]"); // Expected: [1, 2]

        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        int[] result2 = twoSum(numbers2, target2);
        System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 3]

        int[] numbers3 = {-1, 0};
        int target3 = -1;
        int[] result3 = twoSum(numbers3, target3);
        System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]"); // Expected: [1, 2]
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0 ;
        int right = numbers.length - 1;
        int sum = 0;

        while(left<right){
            sum = numbers[left] + numbers[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{};
    }
}
