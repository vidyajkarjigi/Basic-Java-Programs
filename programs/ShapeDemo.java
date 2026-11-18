class Shapes {
    void draw() {
        System.out.println("Drawing a Shape");
    }

    void erase() {
        System.out.println("Erasing a Shape");
    }
}

class Circles extends Shapes {
    void draw() {
        System.out.println("Drawing a Circle");
    }

    void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangles extends Shapes {
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shapes {
    void draw() {
        System.out.println("Drawing a Square");
    }

    void erase() {
        System.out.println("Erasing a Square");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shapes s;

        s = new Circles();
        s.draw();
        s.erase();

        s = new Triangles();
        s.draw();
        s.erase();

        s = new Square();
        s.draw();
        s.erase();
    }
}