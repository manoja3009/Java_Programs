import java.util.Scanner;

public class FullTriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=size;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter the size:5
//      *
//     ***
//    *****
//   *******
//  *********
