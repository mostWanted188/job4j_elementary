package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(400);
        System.out.printf("200 rubles = %.2f euro",euro);
        System.out.println();
        double dollar = Converter.rubleToDollar(300);
        System.out.printf("300 rubles = %.2f dollars", dollar);

    }
}