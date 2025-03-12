package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {
    private float base;
    private float height;

    public Triangle() {
        super();
        this.base = 0.0f;
        this.height = 0.0f;
    }

    public Triangle(float base, float height,String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " with the base of " + base + " and the height of " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) obj;
        boolean sameBase = (triangle.base == this.base);
        boolean sameHeight = (triangle.height == this.height);
        boolean sameColor = this.getColor().equals(triangle.getColor());
        if (sameBase && sameHeight && sameColor){
            return true;
        }
        else{
            return false;
        }

    }


}
