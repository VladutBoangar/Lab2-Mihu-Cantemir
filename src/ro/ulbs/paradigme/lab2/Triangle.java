package ro.ulbs.paradigme.lab2;

public class Triangle {
    private float base;
    private float height;

    public Triangle() {
        this.base = 0.0f;
        this.height = 0.0f;
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " with the base of " + base + " and the height of " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.base, base) == 0 && Float.compare(triangle.height, height) == 0;
    }
}
