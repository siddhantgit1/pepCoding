package Recursion;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid Input");
            return;
        }
        int ans = fact(n);
        System.out.println(ans);
    }

    public static int fact(int n){
        if(n == 0) return 1;
        int ans = n * fact(n-1);
        return ans;
    }
}
