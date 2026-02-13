package oop.ocp;

public class Ellipse extends Shape {
    private double r1;
    private double r2;

    public Ellipse(double major, double minor){
        this.r1 = major;
        this.r2 = minor;
    }

    @Override
    public double calculateArea() {
        return Math.abs(Math.PI*r1*r2);
    }
}
