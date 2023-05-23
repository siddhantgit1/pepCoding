package Array;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i]; j++){
                System.out.println("*");
            }
            System.out.print("\t");
        }
    }
}
