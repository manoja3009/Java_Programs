import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = sc.nextLine();
        String org_String = string;
        String revString = "";
        int leng = string.length();
        for (int i = leng - 1; i >= 0; i--) {
            revString = revString + string.charAt(i);
        }
        if (org_String.equals(revString)) {
            System.out.println(org_String + " It is is a palindrome string");
        } else {
            System.out.println(org_String + " It is not a palindrome string");
        }
        sc.close();
    }
}
