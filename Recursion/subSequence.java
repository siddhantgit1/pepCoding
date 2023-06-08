package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class subSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
    }

    public static ArrayList<String> gss(String str){

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(int i = 0; i < rres.size(); i++){
            mres.add(""+ rres.get(i));
            mres.add(ch+ rres.get(i));
        }

        return mres;
    }
}
