import java.util.*;
public class CompareDemo
{
    public static void main(String args[])
    {
        Student s1 = new Student(100,20,"Saharsh");
        Student s2 = new Student(101,21,"Yash");
        AgeComparator a1 = new AgeComparator();
        int n = a1.compare(s1,s2);
        {
            if(n==0)
            {
                System.out.println("Same age");
            }
            if(n==1)
            {
                System.out.println("Not same age");
            }
        }
    }
}