package SwappingNumbers;

import java.util.Scanner;

public class UsingThirdVairable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int temp;
        // Logic
        System.out.println("Before swapping: " + num1 + " and " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: " + num1 + " and " + num2);

        sc.close();

    }
}