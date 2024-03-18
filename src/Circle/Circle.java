package Circle;

import Shape.Shape;

public class Circle extends Shape {
    protected Double radius;
    protected  String name;

    public Circle(String name, Double radius ){
        this.name = name;
        this.radius = radius;
        this.calculateArea();
    }

    public void calculateArea() {
        super.area = Math.PI * Math.pow(radius, 2);
    }
    public void calculatePerimeter() {
        super.perimeter = 2 *Math.PI *  radius;
    }

    public void getInfo() {
        System.out.println("Circle " + this.name + " info");
        System.out.println(" area: " + super.area);
        System.out.println(" perimeter: " + super.perimeter);
        System.out.println(" with radius : " + radius);
        System.out.println();
    }
}
