public class Loop_ASCII {
    public static void main(String[] args) {
        System.out.println("ASCII Characters and Their Values: \n\n");

        for(int i = 0;i <= 127;i++)
            System.out.printf("ASCII value %3d - Character: %c\n",i,(char)i);
        
    }
}
