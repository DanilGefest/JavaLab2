package geometry3d;

import Exceptions.AreaException;
import geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure baseFigure, double height){
        if(baseFigure == null || baseFigure.area() <= 0){
            throw new AreaException("Negative base area value");
        }
        base = baseFigure;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }
}
