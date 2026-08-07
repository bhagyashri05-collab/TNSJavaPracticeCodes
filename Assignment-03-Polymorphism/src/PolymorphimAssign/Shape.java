package PolymorphimAssign;

public class Shape {

    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }

    public static void main(String[] args) {

        Shape[] shapes = {
            new Shape(),
            new Triangle(),
            new Square()
        };

        for (Shape s : shapes) {
            s.draw();
            s.erase();
            System.out.println("********");
        }
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}