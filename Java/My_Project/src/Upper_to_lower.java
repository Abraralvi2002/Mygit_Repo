import java.util.Scanner;
public class Upper_to_lower {
   public static String changer(String str){
        StringBuilder strc = new StringBuilder();
        for(int i=0; i < str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                strc.append(Character.toLowerCase(c));
            }else{
                strc.append(c);
            }
        }
        return strc.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Your Modified string is: "+changer(str));
    }
}
