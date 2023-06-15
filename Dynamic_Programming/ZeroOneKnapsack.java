package Dynamic_Programming;

import java.util.Scanner;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] values = new int[n];
        for(int i = 0; i < values.length; i++){
            values[i] = sc.nextInt();
        }

        int[] weights = new int[n];
        for(int i = 0; i < weights.length; i++){
            weights[i] = sc.nextInt();
        }

        int capacity = sc.nextInt();

        int[][]dp = new int[n+1][capacity + 1];

        dp[0][0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= capacity; j++){
                 if(j >= weights[i-1]){//jab bat kar sakta hai 
                    if(dp[i-1][j - weights[i-1]] + values[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][j - weights[i-1]] + values[i-1];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }else{//jab bat nai karta
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][capacity]);
    }
}
