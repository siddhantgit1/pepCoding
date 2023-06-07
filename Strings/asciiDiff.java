package Strings;

import java.util.Scanner;

public class asciiDiff {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
		System.out.println(solution(str));
    }

    public static String solution(String str){

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr - prev;

            sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }

}