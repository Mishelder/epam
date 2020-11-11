package edu.epam.last_digit_01.service;


import edu.epam.last_digit_01.entity.Number;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberServiceTest {

    @Test
    public void firstTestFindLastDigitInPow() {
        int num = 13;
        Number number = new Number(num);
        NumberService numberService = new NumberService();
        int expected = 9;
        int actual = numberService.findLastDigitInPow(number);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void secondTestFindLastDigitInPow() {
        int num = 12_456;
        Number number = new Number(num);
        NumberService numberService = new NumberService();
        int expected = 6;
        int actual = numberService.findLastDigitInPow(number);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void thirdTestFindLastDigitInPow() {
        int num = 1_023_443_452;
        Number number = new Number(num);
        NumberService numberService = new NumberService();
        int expected = 4;
        int actual = numberService.findLastDigitInPow(number);
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void fourthTestFindLastDigitInPow() {
        Number number = null;
        NumberService numberService = new NumberService();
        int expected = 0;
        int actual = numberService.findLastDigitInPow(number);
        Assert.assertEquals(actual,expected);
    }
}