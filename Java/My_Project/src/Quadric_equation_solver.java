import java.util.Scanner;

public class Quadric_equation_solver {
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner ipt = new Scanner(System.in);

        System.out.println("Enter the coefficients of 'a' :");
        a = ipt.nextDouble();
        System.out.println("Enter the coefficients of 'b' :");
        b = ipt.nextDouble();
        System.out.println("Enter the coefficients of 'c' :");
        c = ipt.nextDouble();

        d = b*b - 4*a*c;

        int mycase = (d > 0) ? 1 : (d == 0 ? 2 : 3);
        
        switch (mycase) {
            case 1: 
                double x1 = (-b + Math.sqrt(d)) / (2*a);
                double x2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("The roots are Real and Distinct : Root 1 = "+x1+" Root 2 = "+x2);
                break;
            case 2:
                double x = -b / (2*a);
                System.out.println("The roots are Real and Equal : Root 1 = Root 2 = "+x);
                break;
            case 3:
                double real = -b / (2*a);
                double img = Math.sqrt(-d) / (2*a);
                System.out.println("The roots are Complex and Imaginary : Root 1 = "+real+" + "+img+"i Root 2 = "+real+" - "+img+"i");
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }

    }
}
