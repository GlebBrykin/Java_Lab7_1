public class Person
{
    public String name;
    public byte age;

    public Person(String name, byte age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
