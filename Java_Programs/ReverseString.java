import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string=sc.nextLine();
        String revString=" ";
        int leng=string.length();
        for(int i=leng-1;i>=0;i--){
            revString=revString+string.charAt(i);
        }
        System.out.println(revString);
        sc.close();
    }
    
}
