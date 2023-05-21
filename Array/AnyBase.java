package Array;

import java.util.Scanner;

public class AnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int p = 0;
        int res = 0;
        while(n != 0){
            int r = n%b;
            res += r * (int) Math.pow(10, p);
            p++;
            n = n/b;
        }
        System.out.println(res);
    }
}
