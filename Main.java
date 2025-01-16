import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Ivan", (byte)20));
        persons.add(new Person("Maksim", (byte)30));
        persons.add(new Person("Maria", (byte)25));
        persons.add(new Person("Nikita", (byte)20));
        persons.add(new Person("Anna", (byte)20));
        persons.add(new Person("Pavel", (byte)25));
        System.out.println(persons);
        Comparator<Person> comparator = new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o2.age - o1.age;
            }
        }.thenComparing(new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.name.compareTo(o2.name);
            }
        });
        persons.sort(comparator);
        System.out.println(persons);

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Apple", 50));
        products.add(new Product("Sweet", 150));
        products.add(new Product("Banana", 100));
        products.add(new Product("Egg", 75));
        System.out.println(products);
        Collections.sort(products);
        System.out.println(products);
    }
}