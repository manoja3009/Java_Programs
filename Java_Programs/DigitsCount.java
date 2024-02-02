import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits: ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num = num /10;
            count++;
        }
        System.out.println(count);
       sc.close();      
    }
}
