package edu.epam.circle_09.entity;

public class Circle {

    private double radius;

    private void set(double radius){
        this.radius = radius>0 ? radius : Math.abs(radius);
    }

    public Circle(double radius) {
        set(radius);
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        set(radius);
    }

    public double getDiagonal(){
        return 2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}