import java.util.Scanner;

public class dig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0) System.out.println(0);
        int on = n;
        int nod = 0;
        while(n!=0){
            n = n/10;
            nod++;
        }
        // System.out.println(nod);
        int div = (int)Math.pow(10, nod-1);
        while(on != 0){
            int q = on/div;
            int r = on%div;
            System.out.println(q);
            div = div/10;
            on = r;
        }
    }
}
