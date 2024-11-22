import java.util.Scanner;

public class Remove_all_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        String res = str.replace(String.valueOf(ch), "");
        System.out.println("String after removing all occurrences of '" +ch+ "': " +res);
    }
}
