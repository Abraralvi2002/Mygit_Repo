import java.util.Scanner;

public class Leap_year_cheacker {
    public static void main(String[] args) {
        int y;
        String res;
        Scanner ipt = new Scanner(System.in);
        System.out.println("======Welcome to Leap Year Checker======");
        System.out.println("Enter the year you want to check: ");
        y = ipt.nextInt();

        res = (y % 4 == 0) ? ((y % 100 == 0) ? ((y % 400 == 0) ?
         "The given year is a Leap Year" : "The given year is Not a Leap Year") 
           : "The given year is a Leap Year") : "The given year is Not a Leap Year";
        System.out.println(res);
    }
}
