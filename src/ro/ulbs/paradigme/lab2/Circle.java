package ro.ulbs.paradigme.lab2;

public class Circle {
    private float radius;

    public Circle() {
        this.radius = 0.0f;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " with the radius of " + radius;
    }
}
