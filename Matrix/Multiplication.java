package Matrix;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int[][] one = new int[row1][col1];

        for(int i = 0; i < one.length; i++){
            for(int j = 0; j < one[0].length; j++){
                one[i][j] = sc.nextInt();
            }
        }

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        int[][] two = new int[row2][col2];

        for(int i = 0; i < two.length; i++){
            for(int j = 0; j < two[0].length; j++){
                two[i][j] = sc.nextInt();
            }
        }

        if(col1 != row2){
            System.out.println("Invalid input");
            return;
        }

        int[][] prod = new int[row1][col2];

        for(int i = 0; i < prod.length; i++){
            for(int j = 0; j < prod[0].length; j++){
                for(int k = 0; k < col1; k++){
                    prod[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        //print
        for(int i = 0; i < prod.length; i++){
            for(int j = 0; j < prod[0].length; j++){
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
