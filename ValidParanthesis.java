import  java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {

       /*
        String s1 = "()[]{}";
        Boolean res = isValid(s1);
        System.out.println(res);

        String s2 = "([}}])";
        Boolean res2 = isValid(s2);
        System.out.println(res2);
        */

        String s3 = "()";
        Boolean res3 = isValid(s3);
        System.out.println(res3);

    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        //BASE CASE
        if(s.length() % 2 == 1){
            return false;
        }

        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '('){
                st.push(')');
            }
            else if(s.charAt(i) == '{'){
                st.push('}');
            }
            else if (s.charAt(i) == '['){
                st.push(']');
            }
            else if (!st.isEmpty()) {
               if (st.pop() != s.charAt(i)) {
                    return false;
               }
            }
            else {
                return false;
            }
        }

      /*  for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' ||
                    s.charAt(i) == '{' ||
                    s.charAt(i) == '[')
            {
                st.push(s.charAt(i));
            }

            else if(!st.isEmpty()){
                if ((s.charAt(i) == ')' && st.peek() == '(')  ||
                    (s.charAt(i) == ']' && st.peek() == '[')  ||
                    (s.charAt(i) == '}' && st.peek() == '{'))
                {
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
         }*/
        return st.isEmpty();
}
}
