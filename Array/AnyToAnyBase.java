package Array;

import java.util.Scanner;

public class AnyToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int res = 0;
        int p = 0;
        while(n != 0){
            int r = n % b2;
            res += r * (int) Math.pow(b1, p);
            p++;
            n = n/b2;
        }
        System.out.println(res);
    }
}
