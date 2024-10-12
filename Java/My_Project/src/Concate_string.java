import java.util.Scanner;

public class Concate_string {
    public static void main(String[] args) {
        String s1,s2;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        s1 = ipt.nextLine();
        System.out.println("Enter the second String: ");
        s2 = ipt.nextLine();
        System.out.println("The concatenated string is : "+s1+s2);
    }
}
