public class ClimbingStairs {
    public static void main(String[] args) {
        int input1 = 2;
        int res1 = climbStairs(input1);
        System.out.println(res1);

        int input2 = 3;
        int res2 = climbStairs(input2);
        System.out.println(res2);
    }
    public static int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int lastStep = 2;
        int secLastStep = 1;

        for(int i=3;i<=n;i++){
            int current = lastStep + secLastStep;
            secLastStep = lastStep;
            lastStep = current;
        }
        return lastStep;
    }
}
