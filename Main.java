
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Red", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        Shape square = new Square(4.0, "Green", true);

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println();

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println();

        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + ", filled=" + filled + "]";
    }
}

class Square extends Rectangle {
    private double side;

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setLength(side); 
        setWidth(side); 
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + ", color=" + color + ", filled=" + filled + "]";
    }
}
