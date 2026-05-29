public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));   // 1024.0
        System.out.println(myPow(2.1, 3));    // 9.261000000000001
        System.out.println(myPow(2.0, -2));   // 0.25
        System.out.println(myPow(2.0, 0));    // 1.0
    }

    public static double myPow(double x, int n) {
        double res = 1;
        int temp = Math.abs(n);

        while(temp>=1){
            res *= x;
            temp--;
        }

        // res = Math.round(res * 100000.0) / 100000.0;

        if(n>=1){
            return res;
        }
        else if(n<1){
            return 1/res;
        }

        return 0.0;
    }
}
