package edu.epam.points_07.entity;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceFromOriginToPoint(){
        return Math.sqrt(x*x+y*y);
    }

    @Override
    public int hashCode() {
        return (x+y)*41+13;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null || obj.getClass()!=this.getClass())
            return false;
        Point point = (Point) obj;
        return point.x == this.x && point.y == this.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
