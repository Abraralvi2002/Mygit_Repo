import java.util.Scanner;

public class Max_mini {
    public static int larger(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }
    public static int smaller(int n1, int n2) {
        return (n1 < n2) ? n1 : n2;
    }
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = ipt.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = ipt.nextInt();

        int larger = larger(num1, num2);
        int smaller = smaller(num1, num2);

        System.out.println("\nComparing " + num1 + " and " + num2 + ":");
        System.out.println("Larger number is: " + larger);
        System.out.println("Smaller number is: " + smaller);
    }
}
