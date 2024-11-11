import java.util.Scanner;
public class FSIBL {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        String name;
        int nidNum,accNum,creditscore;
        double annualincome,loanamoount;

        System.out.println("Enter your name: ");
        name = ipt.nextLine();
        System.out.println("Enter your NID number: ");
        nidNum = ipt.nextInt();
        System.out.println("Enter your acoount number: ");
        accNum = ipt.nextInt();
        System.out.println("Enter your annual income: ");
        annualincome = ipt.nextDouble();
        System.out.println("Enter your credit Score: ");
        creditscore = ipt.nextInt();
        System.out.println(name+" \n"+nidNum+" \n"+accNum+" \n"+creditscore);
        if(creditscore > 700){
            System.out.println("You are eligible for loan. ");
            System.out.println("Your maximum loan amount is: "+(annualincome*0.5));
        }else if(creditscore > 600 && creditscore < 700){
            System.out.println("You are eligible for loan. ");
            System.out.println("Your maximum loan amount is: "+(annualincome*0.3));
        }else{
            System.out.println("Your are not eligible for loan so your request has been rejected. ");
        }
    }
}
