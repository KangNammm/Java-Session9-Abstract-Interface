package Shape;

import java.util.Random;

public class MainShape {
    public static void main(String[] args) {
        Random random = new Random();

        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (Resizeable shape : shapes) {
            double percent = random.nextDouble() * 100; // Tỉ lệ ngẫu nhiên từ 0-100
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Diện tích ban đầu: " + circle.getArea());
                shape.resize(percent);
                System.out.println("Diện tích sau khi tăng kích thước: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Diện tích ban đầu: " + rectangle.getArea());
                shape.resize(percent);
                System.out.println("Diện tích sau khi tăng kích thước: " + rectangle.getArea());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println("Diện tích ban đầu: " + square.getArea());
                shape.resize(percent);
                System.out.println("Diện tích sau khi tăng kích thước: " + square.getArea());
            }
            System.out.println("-----------------------------");
        }
    }
}
