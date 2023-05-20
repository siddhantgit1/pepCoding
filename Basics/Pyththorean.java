import java.util.Scanner;

public class Pyththorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a = a*a;
        b = b*b;
        c = c*c;

        if(a == b+c || b == a+c || c == a+b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
