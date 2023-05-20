import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 1;
        int cnt = 0;
        while(n > div){
            cnt++;
            div = div * 10;
        }
        if(n==1 || n == 0){
            System.out.println(1);
        }else{
            System.out.println(cnt);
        }

    }
}
