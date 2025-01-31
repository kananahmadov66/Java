public class Main
{
    public static void main(String[] args)
    {
        Student s1=new Student("Kanan", "Ahmadov", 17, 1111, 2500);
        Student s2=new Student("Tyson", "Tyson", 1, 1234, 0);
        System.out.println(s1);
        System.out.println(s2);
        s1.printStudentInformation();
        s2.printStudentInformation();
    }
}