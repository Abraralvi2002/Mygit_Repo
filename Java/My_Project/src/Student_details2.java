public class Student_details2 {
    static int roll = 29;
    Student_details2(String name){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        roll++;
    }
    public static void main(String[] args) {
        System.out.println("City University. ");
        Student_details2 s1 = new Student_details2("Md. Abrar Siddiqui. ");
        Student_details2 s2 = new Student_details2("Arifa Siddika. ");
    }
}
