import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        System.out.println("This is a simple calculator that can calculate between two numbers: ");
        double num1,num2,res;
        Scanner ipt = new Scanner(System.in);
        char operator;

        System.out.println("Enter your first number: ");
        num1 = ipt.nextDouble();
        System.out.println("Enter your seconnd number: ");
        num2 = ipt.nextDouble();
        System.out.println("Enter any operator from (+,-,*,/) ");
        operator = ipt.next().charAt(0);

        switch (operator) {
            case '+':
                res = num1 + num2;
                System.out.println("The claculation is: "+res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println("The claculation is: "+res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println("The claculation is: "+res);
                break;
            case '/':
               if (num2 != 0) {
                res = num1 / num2;
                System.out.println("The claculation is: "+res);
               } else {
                System.out.println("Error: Can't be divisible by zero.");
               }
               break;
        
            default:
            System.out.println("Invalid Input, Please try again.");
                break;
        }
    }
}
