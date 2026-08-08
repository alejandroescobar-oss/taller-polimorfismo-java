package org.yourcompany.yourproject;

public class square extends Figure {
    private double side;

    public square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side*this.side;
    }

    @Override
    public double calculatePerimeter() {
        return this.side*4;
    }
}