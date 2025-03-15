import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Student> compare = (Student s1, Student s2)->{
            if(s1.grade<s2.grade) return 1;
            else if(s1.grade>s2.grade) return -1;
            else
            {
                if(s1.birthYear<s2.birthYear) return -1;
                else if(s1.birthYear>s2.birthYear) return 1;
                else
                {
                    if(s1.gender && !s2.gender) return 1;
                    else if(!s1.gender && s2.gender) return -1;
                    else
                    {
                        if(s1.surname.compareTo(s2.surname) > 0) return 1;
                        else if(s1.surname.compareTo(s2.surname) < 0) return -1;
                        else
                        {
                            if(s1.name.compareTo(s2.name) > 0) return -1;
                            else if(s1.name.compareTo(s2.name) < 0) return 1;
                            else
                            {
                                if(s1.id>s2.id) return 1;
                                else if(s1.id<s2.id) return -1;
                                else return 0;
                            }
                        }
                    }
                }
            }
        };

        // Creating a list of students
        Student[] students = new Student[4];

        // Adding some sample students
        students[0]=new Student(1, "alma", "armud", 87.9f, true, 2012);
        students[1]=new Student(2, "banan", "ciyelek", 72.6f, false, 2011);
        students[2]=new Student(3, "nar", "qogal", 95.8f, false, 2009);
        students[3]=new Student(4, "kismis", "findiq", 78.0f, true, 2008);
        Arrays.sort(students, compare);
        for(int i=0; i<students.length; i++) System.out.println(students[i].toString());
    }
}