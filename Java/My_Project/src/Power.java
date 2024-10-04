import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        double a,res;
        int b;
        System.out.println("Enter Your Number: ");
        a = ipt.nextDouble();
        System.out.println("Now enter the power: ");
        b = ipt.nextInt();
        res = Math.pow(a, b);
        System.out.println("Your result is: "+res);
    }
}
