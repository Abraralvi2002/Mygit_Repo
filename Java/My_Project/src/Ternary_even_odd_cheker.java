import java.util.Scanner;

public class Ternary_even_odd_cheker {
    public static void main(String[] args) {
        int n;
        String res;
        Scanner ipt = new Scanner(System.in);
        System.out.println("======Welcome to Even-Odd Checker======");
        System.out.println("Enter the Integer you want to check: ");
        n = ipt.nextInt();
        res = (n % 2 == 0) ? "The given number is Even." : "The given number is Odd.";
        System.out.println(res);
    }
}
