package Recursion;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int li = lastIndexValue(arr, 0, data);
        System.out.println(li); 
    }

    public static int lastIndexValue(int[] arr, int idx, int data){
        if(idx == arr.length){
            return -1;
        }

        int liisa =  lastIndexValue(arr, idx + 1, data);
        if(liisa == -1){
            if(arr[idx] == data){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }

    }
}
