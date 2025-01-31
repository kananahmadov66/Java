public class Student
{
    private String name;
    private String surname;
    private int age;
    private int id;
    private double salary;

    public Student(String name, String surname, int age, int id, double salary)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.id=id;
        this.salary=salary;
    }

    public String getName()
    {
        return this.name;
    }
    public String getSurname()
    {
        return this.surname;
    }
    public int getAge()
    {
        return this.age;
    }
    public int getId()
    {
        return this.id;
    }
    public double getSalary()
    {
        return this.salary;
    }

    public void printStudentInformation()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Surname: "+this.surname);
        System.out.println("ID: "+this.id);
    }

    @Override
    public String toString()
    {
        return "Student{name='" + name + "', surname='" + surname + "', age=" + age +
                ", id=" + id + ", salary=" + salary + "}";
    }
}