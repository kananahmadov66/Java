public class Student implements Comparable<Student>
{
    int id;
    String name;
    String surname;
    float grade;
    boolean gender;
    int birthYear;

    public Student(int id, String name, String surname, float grade, boolean gender, int birthYear)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo (Student s1)
    {
        return (id > s1.id) ? -1 : (id == s1.id) ? 0 : 1;
    }

    @Override
    public String toString()
    {
        return id + " | " + name + " " + surname + " | Grade: " + grade + " | Gender: " + (gender ? "Female" : "Male") + " | Birth Year: " + birthYear;
    }
}