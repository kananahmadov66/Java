import java.util.Comparator;

public class ComparatorStudent
{
    public static final Comparator<Student> STUDENT_COMPARATOR = Comparator
            .comparingDouble((Student s) -> s.grade).reversed()
            .thenComparingInt(s -> s.birthYear)
            .thenComparing(s -> !s.gender)
            .thenComparing(s -> s.surname)
            .thenComparing(s -> s.name, Comparator.reverseOrder())
            .thenComparingInt(s -> s.id);
}
