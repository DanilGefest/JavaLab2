package org.example;


import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        Button button = new Button();
        button.click();
        System.out.println(button.getClickCount());
        button.click();
        System.out.println(button.getClickCount());
        button.click();
        System.out.println(button.getClickCount());

        System.out.println("\ntask 2");
        Balance balance = new Balance();
        balance.addLeft(3);
        balance.addRight(2);
        balance.addLeft(2);
        System.out.println(balance.result());

        System.out.println("\ntask 3");
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();

        System.out.println("\ntask 4");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(8);
        separator.addNumber(5);
        separator.addNumber(10);
        separator.addNumber(33);
        separator.even();
        separator.odd();

        System.out.println("\ntask 5");
        Table table = new Table(2, 3);
        table.setValue(0, 0, 11);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 1);
        table.setValue(1, 0, 33);
        table.setValue(1, 1, 8);
        table.setValue(1, 2, 15);
        System.out.println("table[0, 1] = " + table.getValue(0, 1));
        System.out.println("rows = " + table.rows());
        System.out.println("cols = " + table.cols());
        System.out.println("table: " + table);
        System.out.println("avg = " + table.average());

        System.out.println("\ntask 6");
        Circle circle = new Circle(3);
        System.out.println("circle area = " + circle.area());
        System.out.println("circle perimetr = " + circle.perimeter());
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("rectangle area = " + rectangle.area());
        System.out.println("rectangle perimetr = " + rectangle.perimeter());

        Cylinder cylinder = new Cylinder(circle, 4);
        System.out.println("cylinder volume = " + cylinder.volume());
    }
}