package Dynamic_Programming;

import java.util.Scanner;

public class paintFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[]dp = new int[n+1];
        dp[1] = k;
        int same = k*1;
        int diff = (k * (k-1));
        int total = same + diff;
        dp[2] = total;

        for(int i = 3; i <= n; i++){
            same = diff;
            diff = total * (k-1);
            total = same + diff;
            dp[i] = total;
        }

        int ans = dp[n];
        System.out.println(ans);

    }
}
