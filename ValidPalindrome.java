public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        Boolean res = isPalindrome(s);
        System.out.println(res);
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        //s = s.toLowerCase();
        for(int i = 0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        String res = sb.toString();
        res = res.toLowerCase();
        int left = 0;
        int right = res.length()-1;

        while(left<right){
            if(res.charAt(left) != res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
