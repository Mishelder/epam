package edu.epam.seconds_06.service;

import edu.epam.seconds_06.entity.Second;
import edu.epam.seconds_06.entity.Time;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class SecondServiceTest {

    @Test
    public void firstTestCalculateTime() {
        SecondService secondService = new SecondService();
        Second seconds = new Second();
        seconds.setCurrentSecond();
        Time expected = new Time(LocalDateTime.now().getHour(),
                LocalDateTime.now().getMinute(),LocalDateTime.now().getSecond());
        Time actual = secondService.calculateTime(seconds);
        Assert.assertEquals(actual,expected);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void secondTestCalculateTime() {
        SecondService secondService = new SecondService();
        Second seconds = null;
        Time expected = new Time(LocalDateTime.now().getHour(),
                LocalDateTime.now().getMinute(),LocalDateTime.now().getSecond());
        Time actual = secondService.calculateTime(seconds);
        Assert.assertEquals(actual,expected);
    }
}