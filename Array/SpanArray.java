package Array;

import java.util.Scanner;

public class SpanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int minsofar = arr[0];
        int maxsofar = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > maxsofar) maxsofar = arr[i];
            if(arr[i] < minsofar) minsofar = arr[i];
        }
        int ans = maxsofar - minsofar;
        System.out.println(ans);
    }
}
