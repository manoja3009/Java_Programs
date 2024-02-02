import java.util.Scanner;

public class LeftPascal {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <=size; i++) {
            for (int j = size-1; j >=i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=size-1;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter the size:5
//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *