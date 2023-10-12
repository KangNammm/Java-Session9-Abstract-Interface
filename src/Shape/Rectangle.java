package Shape;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        this.width *= (1 + percent / 100);
        this.height *= (1 + percent / 100);
    }
    public double getArea() {
        return width * height;
    }
}
