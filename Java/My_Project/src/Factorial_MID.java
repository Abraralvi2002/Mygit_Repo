import java.util.Scanner;

public class Factorial_MID {
   static int m = 1;
    public static void checkFactorial(int n){
    
        m *= n;
        if(n <= 1){
            return;
        }
        checkFactorial(n-1);
    }
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter the last digit of your ID:");
        int n = ipt.nextInt();
        checkFactorial(n);
        System.out.println("The factorial of "+n+" is "+m);

    }
}
