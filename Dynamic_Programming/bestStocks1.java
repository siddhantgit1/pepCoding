package Dynamic_Programming;

import java.util.Scanner;

public class bestStocks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        
        int least_till_now = Integer.MAX_VALUE;
        int max_till_now = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int current_price = prices[i];
            if(current_price < least_till_now){
                least_till_now = current_price;
            }
            int profit = current_price - least_till_now;
            
            if(profit > max_till_now){
                max_till_now = profit;
            }
        }

        System.out.println(max_till_now);
    }
}
