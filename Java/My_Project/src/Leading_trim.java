import java.util.Scanner;

public class Leading_trim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        String res = str.replaceAll("^\\s+", "");
        System.out.println("The string after the trim: "+res);
    }
}
