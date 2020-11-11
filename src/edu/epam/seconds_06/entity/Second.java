package edu.epam.seconds_06.entity;

import java.time.LocalDateTime;

public class Second {

    private long second;

    public Second(){}

    public Second(long second) {
        this.second = second;
    }

    public long getSecond() {
        return second;
    }

    public void setCurrentSecond() {
        this.second = LocalDateTime.now().getSecond()+
                LocalDateTime.now().getMinute()*60+
                LocalDateTime.now().getHour()*3600;
    }

    public void setSecond(long second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Second{" +
                "second=" + second +
                '}';
    }
}
