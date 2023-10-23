package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class keypad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList< String> getKPC(String str) {
        if (str.length() == 0) {                                  //1
          ArrayList< String> bres = new ArrayList<>();
          bres.add("");
          return bres;
        }
    
        char ch = str.charAt(0);                                      //2
        String ros = str.substring(1);                                //3
        ArrayList< String>rres = getKPC(ros);                           //4
        ArrayList< String> mres = new ArrayList<>();
    
        String codeforch = codes[ch - '0'];                           //5
        // for (int i = 0; i < codeforch.length(); i++) {
        //   char chcode = codeforch.charAt(i);
        //   for (String val : rres) {                                   //6
        //     mres.add(chcode + val);
        //   }
        // }

        for(String rstr : rres){
            for(int i = 0; i < codeforch.length(); i++){
                char chcode = codeforch.charAt(i);
                mres.add(chcode + rstr);
            }
        }
        return mres;                                                  //7
      }
}
