package edu.epam.calculation_segment_10.entity;


public class Function {

    private Functions functions;

    public Function(Functions functions) {
        this.functions = functions;
    }

    public double calculateFunction(double x){
        return functions.calculate(x);
    }

    public Functions getFunction() {
        return functions;
    }

    public void setFunction(Functions functions) {
        this.functions = functions;
    }

    @Override
    public String toString() {
        return "A{" +
                "function=" + functions +
                '}';
    }
}
