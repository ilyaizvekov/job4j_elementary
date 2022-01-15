package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 200;
        double man = Fit.manWeight(height);
        String manHundredth = String.format("%.2f", man);
        double women = Fit.womanWeight(height);
        String womanHundredth = String.format("%.2f", women);
        System.out.println("Man 200 is " + manHundredth);
        System.out.println("Woman 200 is " + womanHundredth);
    }

}
