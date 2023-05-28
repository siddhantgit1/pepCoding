package Array;

import java.util.Scanner;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();

        int low =  0;
        int high = arr.length - 1;

        int ceil = 0;
        int floor = 0;

        while(low <= high){
            int mid = (low+high)/2;
            if(data < arr[mid]){
                high = mid -1;
                ceil = arr[mid];
            }else if(data > arr[mid]){
                low = mid + 1;
                floor = arr[mid];
            }else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.print(ceil + "\t");
        System.out.print(floor + "\t");
    }
}
