package edu.epam.comparison_area_03.service;

import edu.epam.comparison_area_03.entity.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FigureServiceTest {

    @Test
    public void firstTestComparisonSquare() {
        int side = 12;
        Square outerSquare = new Square(side);
        SquareService squareService = new SquareService();
        Square innerSquare = squareService.findInnerSquare(outerSquare);
        FigureService figureService = new FigureService();
        int actual = figureService.comparisonSquare(outerSquare,innerSquare);
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void secondTestComparisonSquare() {
        int side = -112;
        Square outerSquare = new Square(side);
        SquareService squareService = new SquareService();
        Square innerSquare = squareService.findInnerSquare(outerSquare);
        FigureService figureService = new FigureService();
        int actual = figureService.comparisonSquare(outerSquare,innerSquare);
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void thirdTestComparisonSquare() {
        int side = 1234567;
        Square outerSquare = new Square(side);
        SquareService squareService = new SquareService();
        Square innerSquare = squareService.findInnerSquare(outerSquare);
        FigureService figureService = new FigureService();
        int actual = figureService.comparisonSquare(outerSquare,innerSquare);
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void fourthTestComparisonSquare() {
        int side = 2;
        Square outerSquare = null;
        SquareService squareService = new SquareService();
        Square innerSquare = squareService.findInnerSquare(outerSquare);
        FigureService figureService = new FigureService();
        int actual = figureService.comparisonSquare(outerSquare,innerSquare);
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void fifthTestComparisonSquare() {
        int side = 2;
        Square outerSquare = new Square(side);
        SquareService squareService = new SquareService();
        Square innerSquare = null;
        FigureService figureService = new FigureService();
        int actual = figureService.comparisonSquare(outerSquare,innerSquare);
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }
}