import java.util.*;
public class AgeComparator implements Comparator<Student>
{
   public int compare(Student s1, Student s2)
    {
        if(s1.age == s2.age)
        {
            return 0;
        }
        return 1;
    }
}