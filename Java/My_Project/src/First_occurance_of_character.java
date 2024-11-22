import java.util.*;

public class First_occurance_of_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character you want to check: ");
        char ch = sc.next().charAt(0);
        int index = str.indexOf(ch);
        if(index != -1){
            System.out.println("The first occurance of character: "+ch+" is at index of "+index);
        }else{
            System.out.println("The given chracter is not present is the given string. ");
        }
    }
}
