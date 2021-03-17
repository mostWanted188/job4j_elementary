package ru.job4j.convert;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inD = 200;
        int expD = 2;
        int outD = Converter.rubleToDollar(inD);
        boolean result = expD == outD;
        System.out.println("120 rubles are 2 dollars. Test result : " + result);
    }
}