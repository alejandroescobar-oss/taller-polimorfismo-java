package org.yourcompany.yourproject;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FigureTest {

    @Test
    public void testCircleAreaAndPerimeter() {
        Figure circle = new circle(1.0f);
        // Área esperada: PI * 1^2 ≈ 3.14159
        assertEquals(Math.PI, circle.calculateArea(), 0.0001);
        // Perímetro esperado: 2 * PI * 1 ≈ 6.28318
        assertEquals(2 * Math.PI, circle.calculatePerimeter(), 0.0001);
    }

    @Test
    public void testSquareAreaAndPerimeter() {
        Figure square = new square(2.3);
        // Área esperada: 2.3 * 2.3 = 5.29
        assertEquals(5.29, square.calculateArea(), 0.0001);        // Perímetro esperado: 4 * 2.3 = 9.2
        assertEquals(9.2, square.calculatePerimeter(), 0.0001);
    }

    @Test
    public void testTriangleArea() {
        Figure triangle = new Triangle(4.2, 4.5);
        // Área esperada: (4.2 * 4.5) / 2 = 9.45
        assertEquals(9.45, triangle.calculateArea(), 0.0001);
    }
}