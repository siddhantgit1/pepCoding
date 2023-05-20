import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = 2;
        while(n != 1){
            if(n%q == 0){
                n = n/q;
                System.out.println(q);
            }else{
                q++;
            }
        }
    }
}
