class Complex {
    double real, imaginary;

    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    Complex multiply(Complex c) {
        return new Complex(
                real * c.real - imaginary * c.imaginary,
                real * c.imaginary + imaginary * c.real
        );
    }

    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real + imaginary * imaginary);
        double m2 = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);

        if (m1 > m2)
            System.out.println("First number has greater magnitude");
        else if (m1 < m2)
            System.out.println("Second number has greater magnitude");
        else
            System.out.println("Both have equal magnitude");
    }

    Complex copy() {
        return new Complex(real, imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Complex1 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        System.out.print("First number: ");
        c1.display();

        System.out.print("Second number: ");
        c2.display();

        System.out.print("Addition: ");
        c1.add(c2).display();

        System.out.print("Multiplication: ");
        c1.multiply(c2).display();

        c1.compareMagnitude(c2);

        Complex c3 = c1.copy();
        c1.real = 10;

        System.out.print("Modified first number: ");
        c1.display();

        System.out.print("Copied number: ");
        c3.display();
    }
}
