import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args){
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //                  t           r
        int[][] matrix =    {{1,2, 3, 4, 5},
                            {14,15,16,17,6},
                            {13,20,19,18,7},
                            {12,11,10,9,8}};
        //                  l           b


        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // walk across the top row, left -> right
            for (int col = left; col <= right; col++) {
                list.add(matrix[top][col]);
            }
            top++;

            // walk down the right column, top -> bottom
            for (int row = top; row <= bottom; row++) {
                list.add(matrix[row][right]);
            }
            right--;

            // walk across the bottom row, right -> left (only if a row remains)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // walk up the left column, bottom -> top (only if a column remains)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }

        return list;
    }
}
