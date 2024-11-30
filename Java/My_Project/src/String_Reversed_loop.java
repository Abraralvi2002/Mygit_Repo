import java.util.Scanner;

public class String_Reversed_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str = sc.nextLine();
        String revString = revstr(str);
        System.out.println("revString string: " + revString);
    }

    public static String revstr(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        return revString;
    }
}
