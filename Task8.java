package task1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = input.nextInt();
        System.out.println("Enter the b");
        int b = input.nextInt();
        System.out.println("Enter the c");
        int c = input.nextInt();
    int i=0;
        if (a==b){ i++;}
        if (a==c) {i++;}
        if (b==c){i++;}
        if (i==1) {
            System.out.println(i+1);}
        else System.out.println(i);
        }
    }
