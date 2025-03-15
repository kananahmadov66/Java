import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Student[] students = new Student[4];

        students[0] = new Student(1, "alma", "armud", 87.9f, true, 2012);
        students[1] = new Student(2, "banan", "ciyelek", 78.0f, false, 2011);
        students[2] = new Student(3, "nar", "qogal", 95.8f, false, 2009);
        students[3] = new Student(4, "kismis", "findiq", 78.0f, true, 2008);

        Arrays.sort(students, ComparatorStudent.STUDENT_COMPARATOR);

        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
