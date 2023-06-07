package Recursion;

import java.util.Scanner;

public class powerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = pow(x,n);
        System.out.println(ans);
    }

    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        int pm1 = pow(x, n-1);
        int ans = x * pm1;
        return ans;
    }
}

