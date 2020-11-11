package edu.epam.seconds_06.entity;

public class Time {

    private long hours;
    private long minutes;
    private long seconds;

    public Time(long hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public int hashCode() {
        return (int)(hours+minutes+seconds)*13+2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Time time = (Time) obj;
        return this.hours == time.hours
                && this.minutes == time.minutes
                && this.seconds == time.seconds;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
