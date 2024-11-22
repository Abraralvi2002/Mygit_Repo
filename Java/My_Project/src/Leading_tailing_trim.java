import java.util.Scanner;

public class Leading_tailing_trim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String res = str.trim();
        System.out.println("The trimmed string is: "+res);
    }
}
