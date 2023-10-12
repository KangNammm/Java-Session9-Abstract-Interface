package Shape;

class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (1 + percent / 100);
    }

    public double getArea() {
        return side * side;
    }
}