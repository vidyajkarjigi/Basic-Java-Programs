class Car
{
    static int totalcars=0;
    String brand;
    Car(String brand)
    {
        this.brand=brand;
        totalcars++;
    }
}
public class StaticVarDemo
{
    public static void main(String[] args)
    {
        new Car("Toyota");
        new Car("Honda");
        System.out.println(Car.totalcars);
    }
}
