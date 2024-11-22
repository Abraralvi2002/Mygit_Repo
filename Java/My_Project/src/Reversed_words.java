import java.util.Scanner;

public class Reversed_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine().trim();
        String[] words = str.split("\\s+");
        StringBuilder revstr = new StringBuilder();
        for(int i = words.length - 1; i >= 0;i--){
            revstr.append(words[i]).append(" ");
        }
        System.out.println("Reversed string is: "+revstr.toString().trim());
    }
}
