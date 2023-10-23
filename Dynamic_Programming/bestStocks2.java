package Dynamic_Programming;

import java.util.Scanner;

public class bestStocks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];
        for(int i = 0; i < n; i++)
        
        
        
        {
            prices[i] = sc.nextInt();
        }

        int buy = 0;
        int sell = 0;
        int profit = 0;

        for(int i = 1; i < n; i++){
            if(prices[i] >= prices[i-1]){
                sell++;
            }else{
                profit += prices[sell] - prices[buy];
                sell = buy = i;
            }
        }
        profit += prices[sell] - prices[buy];
        System.out.println(profit);

    }
}
