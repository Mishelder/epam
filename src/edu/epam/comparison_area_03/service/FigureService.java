package edu.epam.comparison_area_03.service;

import edu.epam.comparison_area_03.entity.Square;

import java.util.Objects;

public class FigureService {

    public int comparisonSquare(Square big, Square small){
        if(Objects.isNull(big))
            throw new NullPointerException("Big square");
        if(Objects.isNull(small))
            throw new NullPointerException("Small square");
        return (int) (big.area()/small.area());
    }
}
