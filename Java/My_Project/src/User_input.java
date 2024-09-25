import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner ipt = new Scanner(System.in);
        
        int batch;
        String name,id,uni;

        System.out.println("Enter your name:");
        name = ipt.nextLine();
        System.out.println("Enter your ID: ");
        id = ipt.nextLine();
        System.out.println("Enter your Batch");
        batch = ipt.nextInt();
        System.out.println("Enter your University Name: ");
        uni = ipt.next();
        System.out.println("Your Initials are:\n");
        System.out.println(name);
        System.out.println(id);
        System.out.println(batch);
        System.out.println(uni);
    }
}
