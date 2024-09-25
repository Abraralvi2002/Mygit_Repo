public class Format_specifier {
    public static void main(String[] args){

        boolean b = false;
        char c = 'X';
        String s = "HELLO" ;
        int i = 1234;
        float f = 55;
        double d = 55.325;

        System.out.printf("Boolean = %b\n",b);
        System.out.printf("Character = %c\n",c);
        System.out.printf("String = %s\n",s);
        System.out.printf("Integer = %d\n",i);
        System.out.printf("Float = %.3f\n",f);
        System.out.printf("Double = %.3f\n",d);
    }
}
