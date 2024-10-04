import java.util.Scanner;

public class Character_counter {
    public static void main(String[] args) {
        int al = 0, dig = 0, spch = 0;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter Your String Here: ");
        String a = ipt.nextLine();
        for(int i = 0;i < a.length();i++){
            char b = a.charAt(i);

            if(Character.isLetter(b)){
                al++;
            }else if(Character.isDigit(b)){
                dig++;
            }else{
                spch++;
            }
        }
        System.out.println("Total number of Alphabets: "+al);
        System.out.println("Total number of Digits: "+dig);
        System.out.println("Total number of Special Character: "+spch);

    }
}
