import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) System.out.println(0);
        while(n!=0){
            int r = n%10;
            System.out.println(r);
            n = n/10;
        }
    }
}
