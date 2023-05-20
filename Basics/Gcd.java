import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int divisor = n1;
        int dividend = n2;
        int r = divisor%dividend;
        while(r!=0){
            r = divisor%dividend;
            if(r == 0) break;
            dividend = divisor;
            divisor = r;
        }
        int gcd = divisor;
        System.out.print(gcd);
    }
}
