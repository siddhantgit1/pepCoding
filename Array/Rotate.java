package Array;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        //reverse p1
        reverse(arr, 0, arr.length-k-1);
        //reverse p2
        reverse(arr, arr.length-k, arr.length-1);
        //reverse all
        reverse(arr, 0, arr.length - 1);

        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    static void reverse(int[] arr, int li, int ri){

        while(li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
        
    }
}
