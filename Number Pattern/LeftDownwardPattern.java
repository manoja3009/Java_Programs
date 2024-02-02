import java.util.Scanner;

public class LeftDownwardPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int i = size; i >= 1; i--) {
            for(int j=i;j<=size;j++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
       sc.close();
    }
}
// Enter the size: 6
//  654321
//   54321
//    4321
//     321
//      21
//       1