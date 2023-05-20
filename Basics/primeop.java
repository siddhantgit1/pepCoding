import java.util.Scanner;

public class primeop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            checkPrime(n);
        }
    }

    static void checkPrime(int n){
        int cnt = 0;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                System.out.println("not prime");
                cnt++;
                break;
            }
        }
        if(cnt == 0) System.out.println("prime");

    }
}
