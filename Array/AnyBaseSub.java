package Array;

import java.util.Scanner;

public class AnyBaseSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt(); //bigger num
        int n2 = sc.nextInt();
        int res = 0;
        int p = 0;
        int c = 0;
        while(n1 != 0){
            int d1 = n1%10;
            n1 = n1/10;
            int d2 = n2%10;
            n2 = n2/10;
            d1 = d1 + c;
            if(d1 < d2){
                c = -1;
                int r = d1 + b - d2;
                res += r * (int)Math.pow(10, p);
            }else{
                c = 0;
                int r = d1 - d2;
                res += r * (int)Math.pow(10, p);
            }
            p++;
        }
        System.out.println(res);
    }
}
