package Strings;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
		solution(str);
    }

    public static void solution(String str){

        int n = str.length();
        int fact = factorial(n);

        for(int i = 0; i < fact; i++){
            int temp = i;
            StringBuilder sb = new StringBuilder(str);

            for(int div = str.length(); div >= 1; div--){
                int q = temp/div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            System.out.println();
        }

    }

    public static int factorial(int n){
        int val = 1;
        for(int i = 2; i <= n; i++){
            val *= i;
        }
        return val;
    }
}
