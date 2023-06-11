package Dynamic_Programming;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fib(n, new int[n+1]);
        System.out.println(ans);
    }

    public static int fib(int n, int[]dp){
        if(n == 0 || n == 1){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        int fibnm1 = fib(n-1, dp);
        int fibnm2 = fib(n-2, dp);
        int fibn = fibnm1 + fibnm2;

        dp[n] = fibn;
        return fibn;
    }

}
