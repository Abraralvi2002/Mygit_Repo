import java.util.Scanner;

public class Compare_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println(str1.equals(str2) ? "The strings are equal." : "The strings are not equal.");

    }
}
