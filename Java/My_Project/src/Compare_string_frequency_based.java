import java.util.Scanner;

public class Compare_string_frequency_based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fist and second string: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char maxChar1 = getmaxfeq(str1);
        char maxChar2 = getmaxfeq(str2);
        if (maxChar1 == maxChar2) {
            System.out.println("Both strings have the same maximum frequency character: " + maxChar1);
        } else {
            System.out.println("The strings have different maximum frequency characters.");
            System.out.println("Max frequency character in first string: " + maxChar1);
            System.out.println("Max frequency character in second string: " + maxChar2);
        }
    }

    public static char getmaxfeq(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int maxFreq = 0;
        char maxChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxFreq) {
                maxFreq = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        return maxChar;
    }
}
