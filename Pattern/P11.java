package Pattern;

import java.util.Scanner;

public class P11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int cnt = 1;
            for(int i = 1; i<= n; i++){
                for(int j = 1;  j <= i; j++){
                    System.out.print(cnt + "\t");
                    cnt++;
                }
                System.out.println();
            }
        }
    
}
