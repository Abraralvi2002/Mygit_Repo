import java.util.Scanner;

public class Property_of_circle {
    public static double dia(double r){
        return 2*r;
    }
    public static double cir(double r){
        return 2*Math.PI*r;
    }
    public static double area(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        double r;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the radious of the circle: ");
        r = ipt.nextDouble();
        System.out.println("Diameter of the circle is : "+dia(r));
        System.out.println("Circumference of the circle is : "+cir(r));
        System.out.println("Area of the circle is : "+area(r));
    }
}
