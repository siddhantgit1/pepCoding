package Array;

import java.util.Scanner;

public class AnyBaseMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();//larger num
        int n2 = sc.nextInt();
        int cnt = 0;
        int res = 0;
        int ans = 0;
        int p = 0;
        int on = n1;

        while(n2 != 0){
            int mult = n2%10;
            int carry = 0;
            while(n1 != 0 || carry != 0){
                int d1 = n1%10;
                int prod = (mult * d1) + carry;
                carry = prod/b;
                int r = prod % b;
                res += r * (int)Math.pow(10, p);
                p++;
                n1 = n1/10;
            }
            res = res * (int)Math.pow(10, cnt);
            // System.out.println(cnt + " :" + res);
            ans += res;
            res = 0;
            n2 = n2/10;
            n1 = on;
            p = 0;
            cnt++;
        }
        System.out.println(ans);

    }
}
