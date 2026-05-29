import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
        System.out.println(lengthOfLongestSubstring(" "));        // 1
    }
    public static int lengthOfLongestSubstring(String s) {
       /* String str = "";
        int maxLength = 0;

        if(s.length() <= 0){
            return 0;
        }
        if(s.length() ==1){
            return 1;
        }

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
            if(!str.contains(String.valueOf(s.charAt(i)))){
                str += s.charAt(i);
                if(str.length()>maxLength){
                    maxLength = str.length();
                }
            }

            else{
                if(str.length()>maxLength){
                    maxLength = str.length();
                }

                while(str.contains(String.valueOf(s.charAt(i)))){
                    str = str.substring(1);
                }
                str += s.charAt(i);
            }
        }

        return maxLength;
        */

        HashSet<Character> set = new HashSet<>();
        int j=0;
        String str = "";
        int maxLength = 0;

        if(s.length() <= 0) {
            return 0;
        }
        if(s.length() ==1) {
            return 1;
        }

        for(int i = 0; i < s.length(); i++) {

            if(!(set.contains(s.charAt(i)))) {
                set.add(s.charAt(i));
                //		System.out.println("set "+ set);
                if(set.size()>maxLength) {
                    maxLength = set.size();
                }
            }


            else {

                while(set.contains(s.charAt(i))) {
                    set.remove(s.charAt(j));
                    j++;

                }
                set.add(s.charAt(i));
                //	System.out.println("set "+ set);
                if(set.size()>maxLength) {
                    maxLength = set.size();
                }

            }
        }

        return maxLength;
    }
}
