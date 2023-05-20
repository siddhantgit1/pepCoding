package Pattern;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int st = 1;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= sp; k++){
                System.out.print("\t");
            }

            for(int k = 1; k <= st; k++){
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
            st++;
        }

    }
}
