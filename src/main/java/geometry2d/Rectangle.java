package geometry2d;

import Exceptions.IncorrectValueException;

public class Rectangle implements Figure {
    private final double length;
    private final double height;

    public Rectangle(double len, double heig) {
        if (len <= 0 || heig <= 0) {
            throw new IncorrectValueException("The sides is specified incorrectly");
        }
        length = len;
        height = heig;
    }

    @Override
    public double area() {
        return length * height;
    }

    @Override
    public double perimeter() {
        return (length + height) * 2;
    }

    @Override
    public String toString() {
        return "length: " + length + " height: " + height;
    }
}