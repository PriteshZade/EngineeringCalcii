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
}