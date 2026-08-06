package PolymorphimAssign;

public class Point {

    private float x;
    private float y;

    // Default constructor
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    // Parameterized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Display method
    public void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }
}