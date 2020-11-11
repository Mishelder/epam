package edu.epam.circle_09.service;

import edu.epam.circle_09.entity.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleServiceTest {

    @Test
    public void testCalculateCircumference() {
        Circle circle = new Circle(5);
        CircleService circleService = new CircleService();
        int actual = (int)circleService.calculateCircumference(circle);
        int expected = 31;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle(5);
        CircleService circleService = new CircleService();
        int actual = (int)circleService.calculateArea(circle);
        int expected = 78;
        Assert.assertEquals(actual,expected);
    }
}