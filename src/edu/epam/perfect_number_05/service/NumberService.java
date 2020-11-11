package edu.epam.perfect_number_05.service;

import edu.epam.perfect_number_05.entity.Number;

import java.util.Objects;

public class NumberService {

    public boolean isPerfectNum(Number number){
        if(Objects.isNull(number))
            throw new NullPointerException("Number is null");
        int sum = 0;
        for(int i=1;i<Math.abs(number.getNum());i++)
            if(number.getNum()%i==0)
                sum+=i;

        return sum == Math.abs(number.getNum());
    }
}
