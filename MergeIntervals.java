import java.util.*;

public class MergeIntervals {
    public  static  void main(String[] args){

        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(input);
        System.out.println(Arrays.deepToString(res));
        /*Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]*/

        int[][] input2 = {{1,3},{2,6},{8,10},{8,9},{9,11},{15,18},{2,4},{16,17}};
        int[][] res2 = merge(input2);
        System.out.println(Arrays.deepToString(res2));
        /*Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]*/
    }
    public static  int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> res = new ArrayList<>();
        int[] current = intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];

            if(current[1]>=next[0]){
                current[1] = Math.max(current[1],next[1]);
            }
            else {
                res.add(current);
                current = next;
            }
        }
        res.add(current);

        return res.toArray(new int[res.size()][]);
    }
}
