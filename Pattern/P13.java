package Pattern;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(num);
            num *= 11;
        }
    }
}
