import java.util.Scanner;

public class Reverse_natural_number {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter a positive integer (n): ");
        int n = ipt.nextInt();

        System.out.println("Natural numbers from " + n + " to 1:");

        while (n >= 1) {
            System.out.print(n+" ");
            n--;
        }
    }
}
