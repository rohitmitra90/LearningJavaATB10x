package JavaBasics;

import java.util.Scanner;
public class DuplicateCountInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s = 0;
        if (sc.hasNextInt()) {
            s = sc.nextInt();
        }
        // Initialize the array's
        // size using user input
        int[] a = new int[s];
        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                a[i] = sc.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < s; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
        for (int j = 0; j <= a.length; j++) {
            for (int k = 1; k < (a.length - j); k++) {
                if (a[k - 1] > a[k]) {
                    int temp = a[k - 1];
                    a[k - 1] = a[k];
                    a[k] = temp;
                }
            }
        }
        System.out.println("the sorted array is:  ");
        for (int j : a) {
            System.out.print(" " + j);
        }
        int previous = a[0] - 1;
        System.out.println("Previous is "+previous);
        int dupCount = 0;
        for (int j : a) {
            if (j == previous) {
                ++dupCount;
            } else {
                previous = j;
            }
        }
        System.out.println("There were " + dupCount + " duplicates in the array.");
    }
}




