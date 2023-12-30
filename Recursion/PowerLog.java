package Recursion;

import java.util.Scanner;

public class PowerLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = pow(x,n);
        System.out.println(ans);
    }

    public static int pow(int x, int n){
        if(n == 0) return 1;
        int halfPow = pow(x, n/2);
        int ans = halfPow * halfPow;
        if(n % 2 != 0){
            ans = ans * x;
        }
        return ans;
    }
}
