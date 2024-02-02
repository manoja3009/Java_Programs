import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        int org_num = number;
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        if (org_num == rev) {
            System.out.println(org_num + " is a palindrome number");
        } else {
            System.out.println(org_num + " is not a palindrome number");
        }
        sc.close();
    }
}
