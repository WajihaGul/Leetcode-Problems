public class LongestRepeatingCharReplacement
{
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        int res = characterReplacement(s,k);
        System.out.println(res);
    }

    public static int characterReplacement(String s, int k) {
        int left = 0;
        int[] freq = new int[26];
        int windowLength = 0;
        int maxFreq = 0;
        int maxWindow = 0;

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxFreq = Math.max(maxFreq , freq[s.charAt(i)-'A']);

            windowLength = i - left + 1;

            if(Math.abs(windowLength - maxFreq) > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            windowLength = i - left + 1;
            maxWindow = Math.max(maxWindow, windowLength);

        }
        return maxWindow;
    }
}