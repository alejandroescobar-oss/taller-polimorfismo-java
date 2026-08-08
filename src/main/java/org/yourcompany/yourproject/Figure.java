package org.yourcompany.yourproject;


public abstract class Figure {
    private double x1;
    private double y1;

    public Figure() {
    }

    public Figure(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    // Métodos abstractos: obligan a las clases hijas a definir sus fórmulas
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}