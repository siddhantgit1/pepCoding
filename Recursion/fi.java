package Recursion;

import java.util.Scanner;

public class fi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int fi = firstIndexValue(arr, 0, data);
        System.out.println(fi);
    }

    public static int firstIndexValue(int[] arr, int idx, int data){
        if(idx >= arr.length){
            return -1;
        }

        int fisa = firstIndexValue(arr, idx+1, data);

        if(arr[idx] == data){
            return idx;
        }else{
            return fisa;
        }
    }
}
