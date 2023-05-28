package Array;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int res[] = new int[arr.length];

        //inverse
        for(int i = 0; i < arr.length; i++){
            int idx = arr[i];
            res[idx] = i;
        }

        for(int val : res){
            System.out.print(val + " ");
        }

    }
}
