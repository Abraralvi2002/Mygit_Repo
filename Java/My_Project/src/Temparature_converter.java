import java.util.Scanner;

public class Temparature_converter {
    public static void main(String[] args) {
        double f,cel;
        double c,far;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temparature in farenheit in order to convert it into celcious: ");
        f = sc.nextDouble();
        cel = (f-32)*5/9;
        System.out.println("The temparature in celcious is : "+cel);

        System.out.println("Enter the temparature in celcious in order to convert it into farenheit: ");
        c = sc.nextDouble();
        far = (c*9/5)+32;
        System.out.println("The temparature in farenheit is : "+far);


    }
}
