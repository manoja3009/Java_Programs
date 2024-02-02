import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first digit: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second digit: ");
        int num2 = sc.nextInt();

        int sum = addNumbers(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }

    // Function to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
