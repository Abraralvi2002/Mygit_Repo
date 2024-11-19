import java.util.Scanner;
public class FSIBL {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        String name;
        int nidNum,accNum,creditscore;
        double annualincome,loanam;

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
        System.out.println("Enter the amount you want as loan. ");
        loanam = ipt.nextDouble();
        System.out.println(name+" \n"+nidNum+" \n"+accNum+" \n"+creditscore);
        if(creditscore >= 700){
            System.out.println("You are eligible for loan. ");
            double loan = annualincome*0.5;
            if(loanam <= loan ){
                System.out.println("Your request is approved and you'll get taka "+loanam+" as loan. ");
            }else{
                System.out.println("Your requst is rejected. ");
            }
        }else if(creditscore >= 600 && creditscore <= 700){
            System.out.println("You are eligible for loan. ");
            double loan = annualincome*0.3;
            if(loanam <= loan ){
                System.out.println("Your request is approved and you'll get taka "+loanam+" as loan. ");
            }else{
                System.out.println("Your requst is rejected. ");
            }
        }else{
            System.out.println("Your are not eligible for loan so your request has been rejected. ");
        }
    }
}
