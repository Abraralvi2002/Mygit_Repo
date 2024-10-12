//Write a Java program to enter any number and calculate its square root.

import java.util.Scanner;

public class Root_calculator {
    public static void main(String[] args) {
        double n;
        Scanner ipt = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = ipt.nextDouble();

        System.out.println("The square root of "+n+" is "+Math.sqrt(n));
         
    }
}
