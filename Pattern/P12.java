package Pattern;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i == 1){
                    System.out.print(a);
                }else if(i == 2 && j == 1){
                    System.out.print(b + "\t");
                }else{
                    int c = a+b;
                    System.out.print(c + "\t");
                    a = b;
                    b = c;
                }
            }
            System.out.println();
        }
    }
}
