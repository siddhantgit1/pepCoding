package Strings;

import java.util.Scanner;

public class compression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        System.out.print(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                System.out.print(count);
                System.out.print(str.charAt(i));
                count = 1;
            }
        }
        System.out.print(count);
    }

}
