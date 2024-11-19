import java.util.Scanner;

public class Reverse_String {
    static String revString(String str){
        StringBuilder rs = new StringBuilder(str);
        return rs.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to be reversed. ");
        String str = sc.nextLine();
        String res = revString(str);
        System.out.println("The reversed string is: "+res);
    }
}
