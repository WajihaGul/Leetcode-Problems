public class LengthOfLongestSubstring {
    public static void main(String[] args) {
         String[] testCases = {
                "abcabcbb", "bbbbb", "pwwkew", "",
                " ", "au", "dvdf", "abba"
        };

        for (String test : testCases) {
            int result = lengthOfLongestSubstring(test);
            System.out.println("Input: \"" + test + "\" -> Longest substring length: " + result);
        }
    }
        public static int lengthOfLongestSubstring(String s) {
            if(s.length() == 0){
                return 0;
            }
            if(s.length() == 1){
                return 1;
            }
            StringBuilder sb = new StringBuilder();
            int count = 1;
            int maxCount = 0;

            sb.append(s.charAt(0));

            for(int i=1;i<s.length();i++){
                if(sb.indexOf(String.valueOf(s.charAt(i))) != -1){
                    if(sb.indexOf(String.valueOf(s.charAt(i))) == 0){
                        sb.deleteCharAt(0);
                        sb.append(s.charAt(i));
                    }
                    else{
                        int idx = sb.indexOf(String.valueOf(s.charAt(i)));
                        sb.delete(0, idx + 1);
                        sb.append(s.charAt(i));
                    }
                }
                else{

                    sb.append(s.charAt(i));
                    // count++;
                }
                //System.out.println(sb.toString());
                maxCount = Math.max(sb.length(),maxCount);


            }
            return maxCount;
        }
    }

