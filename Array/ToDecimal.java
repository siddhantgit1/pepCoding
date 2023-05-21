package Array;

import java.util.Scanner;

public class ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;
        int p = 0;
        while(n != 0){
            int r = n%10;
            res += r * (int) Math.pow(b, p);
            p++; 
            n = n/10;
        }
        System.out.println(res);
    }
}
