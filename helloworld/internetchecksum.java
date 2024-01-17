package helloworld;

import java.util.Scanner;

public class internetchecksum{
    static int n;
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int sum = 0;

        System.out.println("Enter the number of elements :");
        n = sc.nextInt();

        // Initialize the array after getting the value of n
        arr = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int checksum = ~sum;
        RCSUM(arr, n, checksum);
    }

    public static void RCSUM(int arr[], int n, int checksum) {
        int ch = 0, pos = 0;
        int sum = 0;

        System.out.println("Enter the choice:\n1.Error\n2.No Error\n");
        ch = sc.nextInt();

        if (ch == 1) {
            System.out.println("Enter the position where you want to insert the error");
            pos = sc.nextInt();
            System.out.println("Enter the value:");
            arr[pos] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println("The receiver checksum is " + ~sum);
        } else if (ch == 2) {
            System.out.println("The receiver checksum is " + checksum);
        } else {
            System.out.println("Please re-enter the option");
        }
    }
}
