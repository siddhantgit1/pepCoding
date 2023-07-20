package Dynamic_Programming;

import java.util.Scanner;

public class bestStocks3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int fee = sc.nextInt();

        int obsp = -arr[0];
        int ossp = 0;

        for(int i = 1; i < n; i++){

            int nbsp = 0;
            int nssp = 0;

            //nbsp
            if(obsp > ossp - arr[i]){
                nbsp = obsp;
            }else{
                nbsp = ossp - arr[i];
            }

            //nssp
            if(ossp > obsp + arr[i] - fee){
                nssp = ossp;
            }else{
                nssp = obsp + arr[i] - fee;
            }

            ossp = nssp;
            obsp = nbsp;
        }
        System.out.println(ossp);

    }
}
