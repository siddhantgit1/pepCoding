package Strings;

import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = toggle(str);
        System.out.println(ans);
    }

    public static String toggle(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char upperch = (char) ('A' + ch - 'a');
                sb.setCharAt(i, upperch);
            }else if(ch >= 'A' && ch <= 'Z'){
                char lowerch = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lowerch);
            }
        }
        return sb.toString();
    }
}
