import java.util.Scanner;

public class ZeroOnePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1; j<=i;j++){
                int sum=i+j;
                if((sum%2==0)){
                    System.out.print(" 0");
                }
                else{
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter the size: 5
//  0
//  1 0
//  0 1 0
//  1 0 1 0
//  0 1 0 1 0
