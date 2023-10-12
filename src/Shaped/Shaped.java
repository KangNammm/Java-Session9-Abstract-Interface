package Shaped;

public abstract class Shaped {
    private String color;

    public Shaped() {
    }

    public Shaped(String color) {
        this.color = color;
    }
    public abstract void getArea();
    public void display(){
        System.out.println("Color: "+this.color);
    }
}
