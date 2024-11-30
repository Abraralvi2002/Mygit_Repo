import java.util.Scanner;
public class High_frequency {
    static int maxfreq = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String ipt = sc.nextLine();
        char hfc = highfreq(ipt);
        System.out.println(hfc != '\0' ? "Character with the highest frequency: " + hfc : "The string is empty.");
        System.out.println("The max frequency is: "+maxfreq);
    }
    public static char highfreq(String str) {
        if (str == null || str.isEmpty()) return '\0';

        char maxChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ') continue;
            int currentFrequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) currentFrequency++;
            }
            if (currentFrequency > maxfreq) {
                maxfreq = currentFrequency;
                maxChar = currentChar;
            }
        }
        return maxChar;
    }
}
