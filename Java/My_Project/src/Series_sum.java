import java.util.Scanner;

public class Series_sum {
    public static void main(String[] args) {
        int n;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the number of terams: ");
        n = ipt.nextInt();
        int a = 7;   // First term of the series
        int d = 13;  // Common difference 20-7 = 13, 33-20 = 13,...

        int sum = 0;
        int term = a;

        for (int i = 0; i < n; i++) {
            sum += term;   
            term += d;     
        }

        System.out.println("The sum of the series 7 + 20 + 33 + ... up to " + n + " terms is: " + sum);
    }
}
