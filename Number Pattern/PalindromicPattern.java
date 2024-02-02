import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size: ");
       int size=sc.nextInt();
       
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter the size: 5
//     1
//    212
//   32123
//  4321234
// 543212345
