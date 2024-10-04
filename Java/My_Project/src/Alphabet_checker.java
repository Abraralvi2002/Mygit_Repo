import java.util.Scanner;

public class Alphabet_checker {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        char al;
        String res;

        System.out.println("Enter your character: ");
        al = ipt.next().charAt(0);

        res = ((al >= 'a' && al <= 'z') || (al >= 'A' && al <= 'Z')) ? 
        "The character is an alphabet." :
        "The given character is not an alphabet.";
     System.out.println(res);

 
    }
}
