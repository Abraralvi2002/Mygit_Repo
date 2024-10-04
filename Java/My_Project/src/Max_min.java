import java.util.Scanner;

public class Max_min {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        int a,b,c,max,min;
        System.out.println("Enter three diferent integer number: ");
        a = ipt.nextInt();
        b = ipt.nextInt();
        c = ipt.nextInt();
        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        System.out.println("The maximum number is: "+max+" and \nThe minimum number is: "+min);
    }
}
