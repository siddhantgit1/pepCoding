package Dynamic_Programming;

import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oldBuilding = 1;
        int oldSpace = 1;

        for(int i = 2; i < n; i++){
            int newBuilding = oldSpace;
            int newSpace = oldSpace + oldBuilding;

            oldBuilding = newBuilding;
            oldSpace = newSpace;
        }
        int total = oldBuilding + oldSpace;
        total = total*total;
        System.out.println(total);
    }
}
