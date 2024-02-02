package LeapYear;

import java.util.Scanner;

public class Leap2 {
    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }

        sc.close();
    }

    public static void main(String[] args) {
        leapYear();

    }

}
