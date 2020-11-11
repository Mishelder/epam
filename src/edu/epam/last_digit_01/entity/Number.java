package edu.epam.last_digit_01.entity;


public class Number {

    private int num;

    public Number() {}

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getLastDigit(){
        String result = Integer.toString(num);
        final int radix = 10;
        return Character.digit(result.charAt(result.length()-1), radix);
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Number{" +
                "num=" + num +
                '}';
    }
}
