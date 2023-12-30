package Recursion;

import java.util.Scanner;

public class PrintDecInc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecInc(n);
    }

    public static void printDecInc(int n){
        if(n == 0) return;
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }
}
