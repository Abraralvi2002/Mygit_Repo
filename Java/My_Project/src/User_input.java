import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner ipt = new Scanner(System.in);
        
        int num;
        System.out.println("Enter Any Integer Number");
        num = ipt.nextInt();
        System.out.println("Your given nuber is: "+num);
    }
}
