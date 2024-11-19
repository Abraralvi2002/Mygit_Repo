import java.util.Scanner;

public class Toggle_String {
    static String toggle(String str){
        StringBuilder obj = new StringBuilder();
        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);

            if(Character.isUpperCase(c)){
                obj.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                obj.append(Character.toUpperCase(c));
            }else{
                obj.append(c);
            }
        }
        return obj.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to toggle. ");
        String str = sc.nextLine();
        String tog = toggle(str);
        System.out.println("Your toggled string is: \n"+tog);
    }
}
