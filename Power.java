public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));   // 1024.0
      // System.out.println(myPow(2.0, 3));    // 9.261000000000001
      /*  System.out.println(myPow(2.0, -2));   // 0.25
        System.out.println(myPow(2.0, 0));    // 1.0*/
    }

    public static double myPow(double x, int n) {
        double res = 1;
        int temp = Math.abs(n);

        if(n<0){
            n = n* -1;
            x = 1/x;
        }

        while(temp>=1){
            if(temp%2 == 1) {
                res *= x;
            }
            x *= x;
            temp = temp/2;
        }

        return res;
    }
}
