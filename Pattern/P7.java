package Pattern;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            sp++;
            System.out.println("*");

        }
    }
}
