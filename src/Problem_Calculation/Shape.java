package Problem_Calculation;

abstract class Shape {
    protected String name;

    public abstract double calculateArea();

    void displayInfo(){
        System.out.println("The name of the shape is " + name);
    }
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        super.name="Circle";
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(double length,double with){
        super.name = "Rectangle";
        this.length = length;
        this.width = with;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


