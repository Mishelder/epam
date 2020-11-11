package edu.epam.points_07.service;

import edu.epam.points_07.entity.Point;

import java.util.Objects;

public class PointService {

    public static final int X = 0;
    public static final int Y = 0;

    public Point nearestPoint(Point p1, Point p2){
        if(Objects.isNull(p1))
            throw new NullPointerException("Point p1 is null");
        if(Objects.isNull(p2))
            throw new NullPointerException("Point p2 is null");
        double lengthP1 = p1.distanceFromOriginToPoint();
        double lengthP2 = p2.distanceFromOriginToPoint();
       return lengthP1>lengthP2 ? p2 : p1;
    }


}
