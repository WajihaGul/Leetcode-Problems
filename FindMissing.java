import java.util.*;

public class FindMissing {
    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid))); // [2, 4]

        int[][] grid2 = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid2))); // [9, 5]
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();

        int miss = -1;
        int rep = -1;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                }
                else{
                    rep = grid[i][j];
                }
            }
        }
        int n = grid.length;
        for(int i=0;i<=n*n;i++){
            if(!set.contains(i)){
                miss = i;
            }
        }

        return new int[]{rep,miss};
    }
}
