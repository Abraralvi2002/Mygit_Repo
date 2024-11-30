import java.util.Scanner;

public class Words_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String res = revstr(str);
        System.out.println("Modified string: " + res);
    }

    public static String revstr(String str) {
        String[] words = str.split("\\s+");
        if (words.length <= 1) {
            return str;
        }
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
        return String.join(" ", words);
    }
}
