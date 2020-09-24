package task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lesson :");
        int n = input.nextInt();
        System.out.println(n);
        int mm = 9*60+n*45+(n-1)*10-((n-1)%2)*5;
        int mm1 = mm%60;
        int ch = (mm-mm1)/60;
        System.out.println("lesson ends " +ch+ ":" +mm1);
    }
}
