import java.util.Comparator;

public class Product implements Comparable<Product>
{
    public String name;
    public double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }


    @Override
    public int compareTo(Product o)
    {
        return (int)Math.signum(this.price - o.price);
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
