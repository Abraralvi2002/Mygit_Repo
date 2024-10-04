import java.util.Scanner;

public class Cube_calculator {
    public static double cube(double n){
        return n * n * n;
    }
    public static void main(String[] args) {
        double num,res;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the number you wants to be cubed: ");
        num = ipt.nextDouble();
        res = cube(num);
        System.out.println("Your answer is: "+res);
    }
}
