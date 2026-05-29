import java.util.*;
public class isAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
        System.out.println(isAnagram("a", "a"));             // true
        System.out.println(isAnagram("ab", "a"));            // false
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int j=0; j<t.length(); j++) {
            System.out.println(t.charAt(j));
            if(map.containsKey(t.charAt(j))) {
                int count = map.get(t.charAt(j));
                if(count==1){
                    map.remove(t.charAt(j));
                }
                else{
                    map.put(t.charAt(j),count-1);
                }
            }
            else{
                return false;
            }

        }

        return map.isEmpty();

    }
}
