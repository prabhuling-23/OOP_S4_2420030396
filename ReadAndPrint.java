package Arrays;

import java.util.Scanner;

public class ReadAndPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int num : arr) {
            System.out.println(num);
        }
        sc.close();
    }
}
