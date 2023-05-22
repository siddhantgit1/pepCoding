package Array;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int carry = 0;
        int sum = 0;
        int res = 0;
        int p = 0;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int d1 = n1%10;
            int d2 = n2%10;
            sum = d1+d2+carry;
            carry = sum/b;
            int r = sum % b;
            res += r * (int)Math.pow(10, p);
            p++;
            n1 = n1/10;
            n2 = n2/10;
        }
        System.out.println("ans : " + res);
    }
}
