import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter the size:6
// * 
// * * 
// * * * 
// * * * * 
// * * * * *
// * * * * * *