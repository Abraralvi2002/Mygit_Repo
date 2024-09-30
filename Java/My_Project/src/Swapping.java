import java.util.*;
public class Swapping {
    public static void main(String[] args) {
        int x,y;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        x = ipt.nextInt();
        System.out.println("Enter the value of Y: ");
        y = ipt.nextInt();

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("Swapped value of X is :"+x+" \nAnd \nSwapped value of Y is : "+y);

    }
}
