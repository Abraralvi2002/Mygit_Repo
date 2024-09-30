import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int n,rev = 0;
        Scanner ipt = new Scanner(System.in);

        System.out.println("Enter the integer number you want to reverse: ");
        n = ipt.nextInt();

        while(n!=0){

            rev = rev*10;
            rev = rev+n%10;
            n /= 10;

        }

        System.out.println("Reversed number is : "+rev);

    }
}
