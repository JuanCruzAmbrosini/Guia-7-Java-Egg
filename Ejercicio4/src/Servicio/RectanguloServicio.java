/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class RectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo creacionRectangulo() {

        Rectangulo r = new Rectangulo();

        System.out.println("Ingrese la altura del rectángulo: ");
        r.setAltura(leer.nextInt());

        System.out.println("Ingrese la base del rectángulo: ");
        r.setBase(leer.nextInt());

        return r;
    }

    public int calcularArea(Rectangulo r) {

        return (r.getBase() * r.getAltura());
    }

    public int calcularPerimetro(Rectangulo r) {

        return ((r.getBase() + r.getAltura()) * 2);
    }

    public void dibujarRectangulo(Rectangulo r) {

        for (int i = 0; i < r.getAltura(); i++) {

            for (int j = 0; j < r.getBase(); j++) {

                if (i == 0 || i == r.getAltura() - 1 || j == 0 || j == r.getBase() - 1) {

                    if (j < r.getBase() - 1) {

                        System.out.print(" * ");

                    } else {

                        System.out.println(" * ");

                    }

                } else {

                    System.out.print("   ");

                }
            }
        }

    }

}
