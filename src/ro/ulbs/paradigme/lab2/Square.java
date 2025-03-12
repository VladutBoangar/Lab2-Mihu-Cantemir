package ro.ulbs.paradigme.lab2;

public class Square extends Form {
        private float side;

        public Square() {
            super();
            this.side = 0.0f;
        }

        public Square(float side,String color) {
            super(color);
            this.side = side;
        }

        @Override
        public float getArea() {
            return side * side;
        }

        @Override
        public String toString() {
            return super.toString() + " with the side of " + side;
        }
    }
