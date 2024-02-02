package SwappingNumbers;
import java.util.Scanner;

public class UsingSingleLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Before swapping: "+a +" and " +b); 
        b=a+b-(a=b);
        System.out.println("After swapping: "+a +" and " +b);
        sc.close();
    }
    
}
