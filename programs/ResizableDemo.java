interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangles implements Resizable {
    int width, height;

    Rectangles(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

public class ResizableDemo {
    public static void main(String[] args) {

        Rectangles r = new Rectangles(10, 20);

        System.out.println("Original Rectangle:");
        r.display();

        r.resizeWidth(30);
        r.resizeHeight(40);

        System.out.println("\nResized Rectangle:");
        r.display();
    }
}
