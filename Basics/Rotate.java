import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int on = n;
        int nod = 0;
        while(n != 0){
            n=n/10;
            nod++;
        }
        while(k < 0){ //handling the negative value of k here //-7
            k = nod+k; //5-7 -> -2 -> 3
        }
        k = k % nod; // handling overflow here
        int res = 0;
        while(k != 0){
            int r = on%10;
            res += r * (int)Math.pow(10, nod-k);
            on = on/10;
            k--;
        }
        res = res + on;
        System.out.println(res);
    }
}
