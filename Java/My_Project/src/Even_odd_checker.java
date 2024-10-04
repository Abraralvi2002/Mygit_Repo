import java.util.Scanner;

public class Even_odd_checker {
    public static void main(String[] args) {
        int n;
        Scanner ipt = new Scanner(System.in);

        System.out.println("Enter the integer you wants to check: ");
        n = ipt.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println(n+" is Even.");
                break;
            case 1:
                System.out.println(n+" is Odd.");
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
    }
}
