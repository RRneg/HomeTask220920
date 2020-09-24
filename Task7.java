package task1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        int x1 = input.nextInt();
        System.out.println("Enter y1 : ");
        int y1 = input.nextInt();
        System.out.println("Enter x2 : ");
        int x2 = input.nextInt();
        System.out.println("Enter y2 : ");
        int y2 = input.nextInt();
        if (x1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}


