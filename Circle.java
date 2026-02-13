package oop.ocp;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.abs(Math.PI*this.radius*this.radius);
    }
}
