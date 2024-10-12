import java.util.Scanner;

public class Reversed_string {
    public static void main(String[] args) {
        String str,rev;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        str = ipt.nextLine();

        rev = new StringBuilder(str).reverse().toString();
        System.out.println("The reversed string is: "+rev);
    }
}
