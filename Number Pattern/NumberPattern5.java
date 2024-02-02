import java.util.Scanner;

public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num = num + size - j;
            }
            System.out.println();
        }
        sc.close();
    }
}
