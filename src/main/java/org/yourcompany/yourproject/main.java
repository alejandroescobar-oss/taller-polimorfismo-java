
package org.yourcompany.yourproject;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Instanciamos clases concretas guardándolas en referencias del tipo padre (Figure)
        Figure fig1 = new circle(1.0f);        // Radio = 1.0
        Figure fig2 = new square(2.3);         // Lado = 2.3
        Figure fig3 = new Triangle(4.2, 4.5);  // Base = 4.2, Altura = 4.5

        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        // ¡Aquí ocurre el POLIMORFISMO!
        for (Figure fig : figures) {
            System.out.println("------------------------------------");
            System.out.println("Clase Concreta: " + fig.getClass().getSimpleName());
            System.out.println("Area: " + String.format("%.3f", fig.calculateArea()));
            System.out.println("Perimeter: " + String.format("%.3f", fig.calculatePerimeter()));
        }
    }
}