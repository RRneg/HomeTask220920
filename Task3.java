package task1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours1:   ");
        int h1 = input.nextInt();
        System.out.println("Enter min1:   ");
        int min1 = input.nextInt();
        System.out.println("Enter sec1:   ");
        int sec1 = input.nextInt();
        System.out.println("Enter hours2:   ");
        int h2 = input.nextInt();
        System.out.println("Enter min2:   ");
        int min2 = input.nextInt();
        System.out.println("Enter sec2:   ");
        int sec2 = input.nextInt();

        int t1 = h1 * 3660 + min1 * 60 + sec1;
        int t2 = h2 * 3660 + min2 * 60 + sec2;
        int res = t2 - t1;
        System.out.println("Result: " + res);
    }
}
