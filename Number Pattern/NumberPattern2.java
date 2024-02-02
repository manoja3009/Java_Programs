import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter the size: 5
// 1
// 2 1
// 3 2 1
// 4 3 2 1 
// 5 4 3 2 1
