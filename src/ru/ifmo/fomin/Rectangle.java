package ru.ifmo.fomin;

import ru.ifmo.fomin.Point;

import java.awt.geom.Rectangle2D;

/**
 * Created by wolfram on 14.04.15.
 */
public class Rectangle extends Rectangle2D {

    private double width;
    private double height;

    private Point point;

    public Rectangle() {

        point = new Point();

    }

    public Rectangle(double x, double y, double width, double height) {

        point = new Point(x, y);
        this.width = width;
        this.height = height;

    }

    @Override
    public void setRect(double x, double y, double width, double height) {

        point.setLocation(x, y);
        this.width = width;
        this.height = height;

    }

    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {

        if ((width <= 0) || (height <= 0)) return false;

        return true;
    }
}
