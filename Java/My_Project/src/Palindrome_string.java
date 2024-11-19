import java.util.Scanner;

public class Palindrome_string {
    static boolean palindrome(String str){
        str = str.replaceAll("\\s", "").toLowerCase();
        StringBuilder rs = new StringBuilder(str);
        String checker = rs.reverse().toString();
        return str.equals(checker);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String str = sc.nextLine();
        boolean res = palindrome(str);
        if(res){
            System.out.println("The given string is a palindrome. ");
        }else{
            System.out.println("The given string is not a palindrome. ");
        }

    }
}
