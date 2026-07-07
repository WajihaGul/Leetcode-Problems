import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] res = topKFrequent(nums,k);
        System.out.println(Arrays.toString(res));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Integer[] allKeys = map.keySet().toArray(new Integer[0]);

        for(int i = 0; i < allKeys.length; i++){
            int freq = map.get(allKeys[i]);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(allKeys[i]);
            }

        int[] res = new int[k];
        int counter = 0;

        for(int i = bucket.length-1; i>=0 ; i--){
            if(bucket[i] == null){
                continue;
            }

            for(int j = 0; j<bucket[i].size(); j++){
                if(counter == k){
                    break;
                }

                res[counter] = bucket[i].get(j);
                counter++;

            }
        }

            return res;
    }

}
