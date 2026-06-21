public class NumOfIslands {
    public static void main(String[] args) {
        char[][] grid1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
       char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println("Grid 1: " + numIslands(grid1)); // Expected: 1
        System.out.println("Grid 2: " + numIslands(grid2)); // Expected: 3
    }
    public static int numIslands(char[][] grid) {
        int islandCount = 1;

        for (int i = 0;i< grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               System.out.println(grid[i][j]);
                if(grid[i][j]=='1'){
                    if(i == 0 && j == 0){
                        if(grid[i+1][j] == '0' && grid[i][j+1] == '0'){
                            islandCount ++;
                        }
                    }
                    else if(i == 0 && j != 0){
                        if(grid[i][j-1] == '0' && grid[i][j+1] == '0' && grid[i+1][j] == '0' ){
                            islandCount ++;
                        }
                    }
                    else if(i != 0 && j == 0){
                        if(grid[i+1][j] == '0' && grid[i-1][j] == '0' && grid[i][j+1] == '0' ){
                            islandCount ++;
                        }
                    }
                    else if (i == grid.length-1 && j != grid[i].length-1) {
                        if (grid[i - 1][j] == '0' && grid[i][j+1] == '0' && grid[i][j - 1] == '0') {
                            islandCount++;
                        }
                    }
                    else if (i != grid.length-1 && j == grid[i].length-1) {
                        if (grid[i][j-1] == '0' && grid[i+1][j] == '0' && grid[i-1][j] == '0') {
                            islandCount++;
                        }
                    }
                     else if (i == grid.length-1 && j == grid[i].length-1) {
                        if(grid[i-1][j] == '0' && grid[i][j-1] == '0'){
                            islandCount ++;
                        }
                    } else {
                        if (grid[i+1][j] == '0' && grid[i][j+1] == '0' && grid[i-1][j] == '0' & grid[i][j-1] =='0') {
                            islandCount ++;
                        }
                    }
                }
            }
        }

        return islandCount;
    }

    /*public static int numIslands(char[][] grid) {
        int islandCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    boolean topIsZero  = (i == 0) || (grid[i-1][j] == '0');
                    boolean leftIsZero = (j == 0) || (grid[i][j-1] == '0');

                    if (topIsZero && leftIsZero) {
                        islandCount++;
                    }
                }
            }
        }
        return islandCount;
    }*/
}
