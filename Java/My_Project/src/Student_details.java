import java.util.Scanner;

public class Student_details {
    static int roll;
    public static void show(String name, int roll){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll++);
        System.out.println("Name: Arifa Siddika. ");
        System.out.println("Roll: "+roll);
    }
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = ipt.nextLine();
        System.out.println("Enter your Roll: ");
        roll = ipt.nextInt();
        System.out.println("City University ");
        show(name, roll);
    }
}
