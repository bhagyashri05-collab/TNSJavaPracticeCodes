package PolymorphimAssign;

public class StudentDetails {

    // Method 1
    void display() {
        System.out.println("Student Details Are:");
    }

    // Method 2
    void display(String name) {
        System.out.println("Name: " + name);
    }

    // Method 3
    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method 4
    void display(String name, int age, String course) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        StudentDetails s = new StudentDetails();

        s.display();
        System.out.println();

        s.display("Bhagyashri");
        System.out.println();

        s.display("Bhagyashri", 21);
        System.out.println();

        s.display("Bhagyashri", 21, "Information Technology");
    }
}