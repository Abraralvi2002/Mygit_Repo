import java.util.Scanner;

public class Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String vowel = "aeiouAEIOU";
        int vowcount = 0, consocount = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
                if(vowel.indexOf(ch) != -1){
                vowcount++;
            }else{
                consocount++;
            }
         
        }
        System.out.println("The number of vowels: "+vowcount+"\nThe number of consonents: "+consocount);
    }
}
