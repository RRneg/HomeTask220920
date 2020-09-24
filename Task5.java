package task1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the long");
        int h = input.nextInt();
        System.out.println("Enter the up");
        int a = input.nextInt();
        System.out.println("Enter the down");
        int b = input.nextInt();
    double t = (double)((h-a)/(a-b)) + 1;
        System.out.println("It's last   " +t+ "day(s)" );


    }
}
