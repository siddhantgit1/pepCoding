package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(sc.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

    static void solution(ArrayList<Integer> al){
        for(int i = al.size()-1; i >= 0; i--){
            int num = al.get(i);
            if(isPrime(num) == true){
                al.remove(i);
            }
        }
    }

    static boolean isPrime(int num){
        for(int div = 2; div*div <= num; div++){
            if(num % div == 0) return false;
        }
        return true;
    }
}
