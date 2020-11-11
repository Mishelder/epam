package edu.epam.leap_year_02.service;

import edu.epam.leap_year_02.entity.Month;
import edu.epam.leap_year_02.entity.Year;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MonthServiceTest {

    @Test
    public void firstTestDaysOfMonth() {
        Month month = new Month(13);
        Year year = new Year(2001);
        MonthService monthService = new MonthService();
        int actual = monthService.daysOfMonth(month,year);
        int expected = 31;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void secondTestDaysOfMonth() {
        Month month = new Month(2);
        Year year = new Year(2004);
        MonthService monthService = new MonthService();
        int actual = monthService.daysOfMonth(month,year);
        int expected = 29;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void thirdTestDaysOfMonth() {
        Month month = new Month(4);
        Year year = new Year(2004);
        MonthService monthService = new MonthService();
        int actual = monthService.daysOfMonth(month,year);
        int expected = 30;
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void fourthTestDaysOfMonth() {
        Month month = null;
        Year year = new Year(2004);
        MonthService monthService = new MonthService();
        int actual = monthService.daysOfMonth(month,year);
        int expected = 30;
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void fifthTestDaysOfMonth() {
        Month month = new Month(12);
        Year year = null;
        MonthService monthService = new MonthService();
        int actual = monthService.daysOfMonth(month,year);
        int expected = 30;
        Assert.assertEquals(actual,expected);
    }

}