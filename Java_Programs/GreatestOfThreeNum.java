import java.util.Scanner;

public class GreatestOfThreeNum{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = greatestNumber(num1, num2, num3);

        System.out.println("The greatest number is: " + max);

        sc.close();
    }
    static int greatestNumber(int a, int b, int c){
        if (a>=b && a>=c) {
            return a;
        }
        else if (b>=a && b>=c) {
            return b;
        } else {
            return c;
        }
    }
}