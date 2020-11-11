package edu.epam.leap_year_02.service;

import edu.epam.leap_year_02.entity.Month;
import edu.epam.leap_year_02.entity.Months;
import edu.epam.leap_year_02.entity.Year;

import java.util.Objects;

public class MonthService {

    public int daysOfMonth(Month month, Year year){
        if(Objects.isNull(month))
            throw new NullPointerException("Mother is null");
        if(Objects.isNull(year))
            throw new NullPointerException("Year is null");
        if(year.isLeapYear()&&month.getNumber() == 2)
            return Months.FEB.getDays()+1;

        int days = 1 ;
        for(Months months : Months.values())
            if(months.ordinal()+1 == month.getNumber())
                days = months.getDays();
        return days;
    }
}
