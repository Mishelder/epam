package edu.epam.calculation_segment_10.main;

import edu.epam.calculation_segment_10.entity.Function;
import edu.epam.calculation_segment_10.service.FunctionService;

public class Main {

    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();
        Function function = new Function(Math::tan);
        functionService.calculate(0,2,0.1, function);
    }
}
