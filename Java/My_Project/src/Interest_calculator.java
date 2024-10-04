/*Write a Java program to enter P, T, and R and calculate Simple and Compound
Interest.
[Hints:
Compound Interest:
Formula: P * ((1 + R / 100) T - 1) (where P = Principle, T = Time, R = Rate)
Simple Interest:
Formula: Principle * Time * Rate / 100] */
import java.util.*;
public class Interest_calculator {
    public static void main(String[] args) {
        int p;
        double t,r,smp,cmp;
        Scanner ipt = new Scanner(System.in);
        
        System.out.println("Enter the amount of your principle: ");
        p = ipt.nextInt();
        System.out.println("Enter the duration, in year: ");
        t = ipt.nextDouble();
        System.out.println("Enter the rate of interest: ");
        r = ipt.nextDouble();
        smp = p * t * r/100;
        cmp = p * ((1 + r/100) * t - 1);
        System.out.println("The Simple Interest is: "+smp+" \n& The compound interest is: "+cmp);
    }
}
