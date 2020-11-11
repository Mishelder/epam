package edu.epam.leap_year_02.entity;

public class Year {

    private int number;

    private void set(int number){
        this.number = isYear(number) ?  number : java.time.Year.now().getValue();
    }

    public Year(int number) {
       set(number);
    }

    public boolean isYear(int number){
        return number>0&&number< java.time.Year.now().getValue();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
      set(number);
    }

    public boolean isLeapYear(){
        return number % 4 == 0;
    }

    @Override
    public String toString() {
        return "Year{" +
                "number=" + number +
                '}';
    }
}
