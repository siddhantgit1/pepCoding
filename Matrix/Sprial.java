package Matrix;

import java.util.Scanner;

public class Sprial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;

        // int total_element = (arr.length)*(arr[0].length);
        int total_element = row*col;
        int count = 0;

        while(count < total_element){

            //left wall
            for(int i = minr,  j = minc; i <= maxr && count < total_element; i++){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minc++;
            //bottom wall
            for(int i = maxr,  j = minc; j <= maxc && count < total_element; j++){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxr--;
            //right wall
            for(int i = maxr,  j = maxc; i >= minr && count < total_element; i--){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxc--;
            //top wall
            for(int i = minr,  j = maxc; j >= minc && count < total_element; j--){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minr++;
        }
    }
}