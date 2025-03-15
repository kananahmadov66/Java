import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        if (s1.grade<s2.grade) return 1;
        else if (s1.grade>s2.grade) return -1;
        else
        {
            if (s1.birthYear<s2.birthYear) return -1;
            else if (s1.birthYear > s2.birthYear) return 1;
            else
            {
                if (s1.gender && !s2.gender) return 1;
                else if (!s1.gender && s2.gender) return -1;
                else
                {
                    if (s1.surname.compareTo(s2.surname) > 0) return 1;
                    else if (s1.surname.compareTo(s2.surname) < 0) return -1;
                    else
                    {
                        if (s1.name.compareTo(s2.name) > 0) return -1;
                        else if (s1.name.compareTo(s2.name) < 0) return 1;
                        else
                        {
                            return Integer.compare(s1.id, s2.id);
                        }
                    }
                }
            }
        }
    }
}