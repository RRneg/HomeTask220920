package task1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the way a day :");
        int n = input.nextInt();
        System.out.println("Enter the all way :");
        int m = input.nextInt();

        System.out.println("DAY:" + Math.ceil((double)m/n));

    }

}
