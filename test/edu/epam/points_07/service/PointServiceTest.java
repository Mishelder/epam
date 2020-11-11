package edu.epam.points_07.service;

import edu.epam.points_07.entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointServiceTest {

    @Test
    public void firstTestNearestPoint() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,1);
        PointService pointService = new PointService();
        Point actual = pointService.nearestPoint(p1,p2);

        Point expected = new Point(1,1);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void secondTestNearestPoint() {
        Point p1 = new Point(123,234);
        Point p2 = new Point(34,56);
        PointService pointService = new PointService();
        Point actual = pointService.nearestPoint(p1,p2);

        Point expected = new Point(34,56);
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void thirdTestNearestPoint() {
        Point p1 = null;
        Point p2 = new Point(34,56);
        PointService pointService = new PointService();
        Point actual = pointService.nearestPoint(p1,p2);

        Point expected = new Point(34,56);
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void fourthTestNearestPoint() {
        Point p1 = new Point(123,234);
        Point p2 = null;
        PointService pointService = new PointService();
        Point actual = pointService.nearestPoint(p1,p2);

        Point expected = new Point(34,56);
        Assert.assertEquals(actual,expected);
    }
}