public class SearchMatrix {
        public static void main(String[] args) {
        // Test 1: target exists — Expected: true
        int[][] matrix1 = {
            {1,  3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println("Test 1: " + searchMatrix(matrix1, 3));

        // Test 2: target doesn't exist — Expected: false
        int[][] matrix2 = {
            {1,  3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println("Test 2: " + searchMatrix(matrix2, 13));

        // Test 3: target is last element — Expected: true
        int[][] matrix3 = {
            {1,  3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println("Test 3: " + searchMatrix(matrix3, 60));

        // Test 4: single element, match — Expected: true
        int[][] matrix4 = {{5}};
        System.out.println("Test 4: " + searchMatrix(matrix4, 5));

        // Test 5: single element, no match — Expected: false
        int[][] matrix5 = {{5}};
        System.out.println("Test 5: " + searchMatrix(matrix5, 9));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
     		int mid = matrix.length / 2;

		int temp = matrix[mid][matrix[0].length - 1]; // last element of mid row

		if (temp >= target) {
			// search upper half only (rows 0 to mid)
			for (int i = 0; i <= mid; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] == target) return true;
				}
			}
		} else {
			// search lower half only (rows mid+1 to end)
			for (int i = mid + 1; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] == target) return true;
				}
			}
		}
		return false;
    }
}
