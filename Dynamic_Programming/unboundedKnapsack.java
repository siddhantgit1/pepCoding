package Dynamic_Programming;

import java.util.Scanner;

public class unboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] values = new int[n];
        for(int i = 0; i < n; i++){
            values[i] = sc.nextInt();
        }

        int[] weights = new int[n];
        for(int i = 0; i < n; i++){
            weights[i] = sc.nextInt();
        }

        int capacity = sc.nextInt();
        int[] dp = new int[capacity + 1];
        for(int bagCapacity = 0; bagCapacity <= capacity; bagCapacity++){
            int max = 0;
            for(int i = 0; i < n; i++){
                if(bagCapacity >= weights[i]){
                    int remainingCap = bagCapacity - weights[i];
                    int remainingVal = dp[remainingCap];
                    int totalValue = values[i] + remainingVal;

                    if(totalValue > max){
                        max = totalValue;
                    }
                }
            }
            dp[bagCapacity] = max;
        }
        System.out.println(dp[capacity]);

    }
}
