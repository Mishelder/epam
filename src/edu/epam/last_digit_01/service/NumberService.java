package edu.epam.last_digit_01.service;

import edu.epam.last_digit_01.entity.Number;

import java.util.Objects;

public class NumberService {

    public static final int POWER = 2;

    public int findLastDigitInPow(Number num) {
        if(Objects.isNull(num))
            throw new NullPointerException("Number is null");
        int numInSquared =(int) Math.pow(num.getLastDigit(),POWER);
        return new Number(numInSquared).getLastDigit();
    }
}
