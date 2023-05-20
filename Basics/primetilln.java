import java.util.Scanner;

public class primetilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low; i <= high; i++){
            checkPrime(i);
        }
    }

    static void checkPrime(int n){
        int cnt = 0;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                cnt++;
                break;
            }
        }
        if(cnt == 0) System.out.println(n);
    }
}
