import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        str = str.replaceAll("\\s", "");
        int alphabets = 0, digits = 0, specials = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                alphabets++;
            }else if(Character.isDigit(ch)){
                digits++;
            }else{
                specials++;
            }
        }
        System.out.println("Number of Alphabets in the string: "+alphabets+"\nNumber of Digits: "+digits+"\nNumber of Special Character: "+specials);
    }
}
