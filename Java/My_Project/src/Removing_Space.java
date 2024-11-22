import java.util.Scanner;

public class Removing_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        str = str.replaceAll("\\s", "");
        System.out.println("Your modified string is: \n"+str);
    }
}
