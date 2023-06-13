package Dynamic_Programming;

import java.util.Scanner;

public class coinChangePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] coins = new int[n];
        for(int i = 0; i < coins.length; i++){
            coins[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        int[] dp = new int[tar + 1];
        dp[0] = 1;
        for(int amt = 0; amt <= tar; amt++){
            for(int coin : coins){
                if(coin <= amt){
                    dp[amt] += dp[amt - coin];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}
