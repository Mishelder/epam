package edu.epam.leap_year_02.entity;

public class Month {

    private int number;

    public Month(int number) {
        this.number = isMonth(number) ?  number : 1;
    }

    public boolean isMonth(int number){
        return number>0&&number<13;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = isMonth(number) ?  number : 1;
    }

    @Override
    public String toString() {
        return "Month{" +
                "number=" + number +
                '}';
    }
}
