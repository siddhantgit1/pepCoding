import java.util.Scanner;

public class inversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //21453
        int invnum = 0;
        int op = 1; //inc it with one with every step
        while(n != 0){
            int od = n%10;//3
            //now we've to inverse this
            int id = op;
            int ip = od;
            invnum += (int)(id * Math.pow(10,ip-1));
            n = n/10;
            op++;
        }
        System.out.println(invnum);

    }
}
