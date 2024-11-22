import java.util.Scanner;

public class All_occurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character you want to find: ");
        char ch = sc.next().charAt(0);
        boolean count = false;
        for(int i =0;i < str.length();i++){
            if(str.charAt(i)==ch){
                System.out.print(i+" ");
                count = true;
            }
        }
        if(!count)
            System.out.println("The given character is not present in the string. ");
    }
}
