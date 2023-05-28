package Array;

import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int limit = (int)Math.pow(2,arr.length);

        //binary representation of the nums 
        for(int i = 0; i < limit; i++){

            int temp = i;
            String res = "";

            for(int j = 0; j < arr.length; j++){
                int r = temp % 2;
                if(r == 0){
                    res = "-" + " " + res;
                }else{
                    res = arr[j] + " " + res;
                }
                temp = temp / 2;
            }
            System.out.println(res);
            
        }
    }
}
