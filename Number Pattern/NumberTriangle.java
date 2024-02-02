import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter the size: 5
//      1 
//     1 2 
//    1 2 3 
//   1 2 3 4 
//  1 2 3 4 5