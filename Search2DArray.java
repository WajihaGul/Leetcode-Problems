public class Search2DArray {
    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean res = searchMatrix(matrix,target);
        System.out.println(res);

        int[][] matrix2 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target2 = 13;
        boolean res2 = searchMatrix(matrix2,target2);
        System.out.println(res2);
    }
    public static boolean searchMatrix(int[][] matrix, int target){
        int mid = matrix.length/2;
        int tempSum = matrix[mid][matrix[mid].length-1];

        if(tempSum>target){
            for(int i=0;i<=mid;i++){
                for(int j= 0;j<matrix[i].length;j++){
                    if(matrix[i][j]==target){
                        return true;
                    }
                }
            }
        }
        else if(tempSum<target) {
            for (int i = mid + 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        else if(target == tempSum){
            return true;
        }
        return  false;
    }
}
