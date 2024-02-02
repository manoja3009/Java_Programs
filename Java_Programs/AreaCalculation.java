import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextInt();
        System.out.println("Enter Breadth: ");
        double breadth = sc.nextInt();
        double area = length*breadth;
        System.out.println("Area of rectangle: "+area);
        sc.close();
    }
}
