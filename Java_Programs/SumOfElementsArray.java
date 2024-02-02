import java.util.Scanner;

public class SumOfElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int num = sc.nextInt();
        int sum = 0;
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Number: " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        for (int element : a) {
            sum = sum + element;
        }
        System.out.println("The sum of array is "+sum);
        sc.close();
    }
}
