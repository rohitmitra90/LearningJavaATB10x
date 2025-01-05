package JavaBasics;

import java.util.Scanner;

public class Lab002_UseTwoMains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        boolean odd = main(n);
        if (odd)
        {
            System.out.println("This is an odd number");
        }
       else
            System.out.println("This is an even number");
    }
    public static boolean main (int a)
    {
        return a % 2 != 0;
    }
}
