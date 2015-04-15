import java.util.*;
public class Person implements Comparable
{
    private String name;
    public Person(String name)
    {
        this.name=name;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Person> people=new ArrayList<Person>();
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter person: ");
            Person n=new Person(in.next());
            people.add(n);
        }
        System.out.println(people);
    }
    public int compareTo(Object otherObject)
    {
        Person other=(Person)otherObject;
        if(this.name.equals(other.name))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
