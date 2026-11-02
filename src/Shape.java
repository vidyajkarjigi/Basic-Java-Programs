class Shape1 {
    double area() {
        return 0;
    }
}

class Circle1 extends Shape1 {
    double r = 5;

    @Override
    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle1 extends Shape1 {
    double l = 4, b = 6;

    @Override
    double area() {
        return l * b;
    }
}

class Triangle extends Shape1 {
    double b = 8, h = 5;

    @Override
    double area() {
        return 0.5 * b * h;
    }
}

public class Shape {
    public static void main(String[] args) {
        Shape1[] s = {
                new Circle1(),
                new Rectangle1(),
                new Triangle()
        };

        for (Shape1 x : s){
            System.out.println("Area: " + x.area());
        }
    }
}