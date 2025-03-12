package ro.ulbs.paradigme.lab2;

    public class Square extends Form {
        private float side;

        public Square() {
            this.side = 0.0f;
        }

        public Square(float side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public String toString() {
            return super.toString() + " with the side of " + side;
        }
    }
