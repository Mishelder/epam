package edu.epam.comparison_area_03.entity;

public class Square {

    private double side;

    private void set(double side){
        this.side = side>0 ? side : Math.abs(side);
    }

    public Square(double side) {
        set(side);
    }

    public double area(){
        return side*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        set(side);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Square square = (Square) obj;
        return square.side == this.side;
    }

    @Override
    public int hashCode() {
        return (int) (side*41 + 1);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
