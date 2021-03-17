package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)) ;
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int x2 = 5;
        int y2 = 7;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + x1 + "," + y1 + ")" + " to (" + x2 + "," + y2 +") -> " + result);
    }
}