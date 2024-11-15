import java.util.Scanner;

public class Prime_recursion {
    public static boolean isPrime(int num, int i) {
        if (num <= 2) return num == 2;
        if (num % i == 0) return false;
        if (i > Math.sqrt(num)) return true;
        return isPrime(num, i + 1);
    }

    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = ipt.nextInt();
        if (isPrime(num, 2)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
