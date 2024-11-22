import java.util.Scanner;

public class Word_counter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] words = str.trim().split("\\s+");
        int count = words.length;
        if(str.isBlank()){
            count = 0;
        }
        System.out.println("Total number of words in the string: "+count);
    }
}
