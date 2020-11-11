package edu.epam.circle_09.service;

import edu.epam.circle_09.entity.Circle;

public class CircleService {

    public double calculateCircumference(Circle circle){
        return circle.circumference();
    }

    public double calculateArea(Circle circle){
        return circle.area();
    }
}
