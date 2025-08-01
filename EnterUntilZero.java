package controlstatements;

import java.util.Scanner;

public class EnterUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if (n == 0) break;
            if (n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }

        sc.close();
    }
}
