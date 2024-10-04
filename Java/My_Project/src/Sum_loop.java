import java.util.Scanner;

public class Sum_loop {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner ipt = new Scanner(System.in);

        System.out.println("Enter the last 'n'th digit of the series: ");
        n = ipt.nextInt();

        for(int i = 1;i <= n;i++){
            sum += i * i;
        }
     System.out.println("The sum of the series 1^2 + 2^2 + ... + "+n+"^2 is: "+sum);

    }
}
