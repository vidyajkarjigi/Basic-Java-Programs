class Vehicle1 {
    String brand;

    Vehicle1(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car1 extends Vehicle1 {
    String brand;

    Car1(String b1, String b2) {
        super(b1);
        this.brand = b2;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Car Brand: " + brand);
    }
}

public class Vechicle {
    public static void main(String[] args) {
        Car1 c = new Car1("Toyota", "BMW");
        c.display();
    }
}
