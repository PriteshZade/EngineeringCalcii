import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        double y = c.add(3.8, 4.6);
        //System.out.println(y);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public double Sqrt(double a) {
        return Math.sqrt(a);
    }

    public double square(double x) {
        double s = x * x;
        return s;
    }

    public double cube(double a) {
        double b = a * a * a;
        return b;
    }
}