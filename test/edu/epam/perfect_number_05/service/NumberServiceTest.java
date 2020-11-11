package edu.epam.perfect_number_05.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import edu.epam.perfect_number_05.entity.Number;
public class NumberServiceTest {

    @Test
    public void firstTestIsPerfectNum() {
        Number num = new Number(6);
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNum(num);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void secondTestIsPerfectNum() {
        Number num = new Number(28);
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNum(num);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void thirdTestIsPerfectNum() {
        Number num = new Number(496);
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNum(num);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void fourthTestIsPerfectNum() {
        Number num = new Number(1234);
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNum(num);
        boolean expected = false;
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void fifthTestIsPerfectNum() {
        Number num = null;
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNum(num);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void sixthTestIsPerfectNum() {
        Number num = new Number(-28);
        NumberService numberService = new NumberService();
        boolean actual = numberService.isPerfectNum(num);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

}