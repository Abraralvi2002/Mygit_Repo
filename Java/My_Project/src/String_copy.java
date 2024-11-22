import java.util.Scanner;

public class String_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String cpystr = String.copyValueOf(str.toCharArray());
        System.out.println("Original String: "+str);
        System.out.println("Copied String: "+cpystr);

    }
}
