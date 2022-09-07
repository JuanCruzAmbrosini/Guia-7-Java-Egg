/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio6;

import Entidades.Cafetera;
import Servicios.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CafeteraService cs = new CafeteraService();
        Cafetera cafetera1 = cs.asignaciónDeDatos();

        int opcionSeleccionada;
        
        boolean continuar = true;

        do {

            System.out.println("---------------------------------------------------");
            System.out.println("Seleccione la opción deseada: ");
            System.out.println("1) Llenar cafetera.");
            System.out.println("2) Servir taza.");
            System.out.println("3) Vaciar cafetera.");
            System.out.println("4) Agregar café a la cafetera.");
            System.out.println("5) Salir");
            System.out.println("---------------------------------------------------");

            opcionSeleccionada = leer.nextInt();

            switch (opcionSeleccionada) {

                case 1:

                    cs.llenarCafetera(cafetera1);

                    break;

                case 2:

                    System.out.println("Ingrese el tamaño de la taza a llenar: ");
                    double tamanoTaza = leer.nextDouble();

                    cs.servirTaza(tamanoTaza, cafetera1);

                    break;

                case 3:

                    cs.vaciarCafetera(cafetera1);
                    
                    break;

                case 4:

                    System.out.println("Ingrese la cantidad de café que desea agregar: ");
                    double cantCafe = leer.nextDouble();
                    
                    cs.agregarCafe(cantCafe, cafetera1);
                    
                    break;

                case 5:

                    continuar = false;
                    System.out.println("Gracias por utilizar nuestros servicios.");
                    break;

                default:

                    System.out.println("Ingrese un valor válido.");
            }
        } while (continuar);
    }

}
