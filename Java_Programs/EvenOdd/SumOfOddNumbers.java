package EvenOdd;

import java.util.Scanner;

public class SumOfOddNumbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        int sum=0;
        for(int i=1;i<=limit;i++){
            if (i%2!=0) {
                sum=sum+i;
            }
        }
        System.out.print("The sum of given number is "+sum);
        sc.close();
    }
}
