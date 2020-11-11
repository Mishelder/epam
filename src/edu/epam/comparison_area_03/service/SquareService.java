package edu.epam.comparison_area_03.service;

import edu.epam.comparison_area_03.entity.Circle;
import edu.epam.comparison_area_03.entity.Square;

import java.util.Objects;

public class SquareService {

    public Square findInnerSquare(Square square){
        if(Objects.isNull(square))
            throw new NullPointerException("square is null");
        double radius = square.getSide() / 2;
        Circle innerCircle = new Circle(radius);
        double side = innerCircle.getDiagonal() / Math.sqrt(2);
        return new Square(side);
    }
}
