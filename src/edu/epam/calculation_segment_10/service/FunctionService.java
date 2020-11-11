package edu.epam.calculation_segment_10.service;

import edu.epam.calculation_segment_10.entity.Function;

import java.text.DecimalFormat;

public class FunctionService {

    public boolean calculate(double leftBorder, double rightBorder, double step, Function function) {
        if(function==null)
            return false;
        if(leftBorder<0||rightBorder<0||step<0)
            return false;
        if(leftBorder>rightBorder)
            return false;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result =0.0;
        for (; leftBorder <= rightBorder; leftBorder += step) {
            result+=function.calculateFunction(leftBorder);
            System.out.println(decimalFormat.format(leftBorder) + " | " +function.calculateFunction(result) + " | "  + step);
        }
        return true;
    }
}
