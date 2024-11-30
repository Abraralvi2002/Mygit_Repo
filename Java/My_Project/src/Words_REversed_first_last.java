import java.util.Scanner;

public class Words_REversed_first_last {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String res = revstr(str);
        System.out.println("Modified string: " + res);
    }

    public static String revstr(String str) {
        String[] words = str.split("\\s+");
        if (words.length == 0) {
            return str;
        }
        words[0] = revword(words[0]);
        if (words.length > 1) {
            words[words.length - 1] = revword(words[words.length - 1]);
        }
        return String.join(" ", words);
    }

    public static String revword(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
