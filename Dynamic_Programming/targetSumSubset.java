package Dynamic_Programming;

import java.util.Scanner;

public class targetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        boolean [][] dp = new boolean [n + 1][tar + 1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j <= tar; j++){
                //1st cell
                //1st row
                //1st col
                //rest
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = false;
                }else if(j == 0){
                    dp[i][j] = true;
                }else{  
                    //we will only check when the j is more than the val
                    //if the val decides not to come
                    // -> it will check if their team can make it?
                    if(dp[i-1][j] == true){
                        dp[i][j] = true;
                    }else{
                        int val = arr[i -1];
                        if(j >= val){
                            if(dp[i-1][j - val] = true){
                                dp[i][j] = true;
                            }
                        }
                    }
                    //if yes then true then true

                    //if the val decides to come
                    // -> 
                    
                }
                
            }
        }
        System.out.println(dp[arr.length][tar]);
    }
}
