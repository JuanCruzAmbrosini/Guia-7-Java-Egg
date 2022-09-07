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
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author Juan Cruz
 */
public class CafeteraService {

    public Cafetera asignaciónDeDatos() {

        Cafetera cafeteraEj = new Cafetera();
        cafeteraEj.setCapacidadMaxima(1500);
        cafeteraEj.setCapacidadActual(0);

        return cafeteraEj;
    }

    public void llenarCafetera(Cafetera cafeteraEj) {

        cafeteraEj.setCapacidadActual(cafeteraEj.getCapacidadMaxima());

        System.out.println("Cafetera rellenada con éxito.");
    }

    public void servirTaza(double tamanoTaza, Cafetera cafeteraEj) {

        if (tamanoTaza <= cafeteraEj.getCapacidadActual()) {

            cafeteraEj.setCapacidadActual(cafeteraEj.getCapacidadActual() - tamanoTaza);
            System.out.println("La taza ha sido cargada con éxito.");
            
        } else {

            System.out.println("Cantidadad insuficiente. Se cargaron " + cafeteraEj.getCapacidadActual() + " ml en la taza.");

            cafeteraEj.setCapacidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafeteraEj) {

        cafeteraEj.setCapacidadActual(0);
        
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe ( double cantidadCafe, Cafetera cafeteraEj){
        
        if ( (cantidadCafe + cafeteraEj.getCapacidadActual()) <= cafeteraEj.getCapacidadMaxima() ){
            
            cafeteraEj.setCapacidadActual( cantidadCafe + cafeteraEj.getCapacidadActual() );
            System.out.println("Se cargó el café con éxito.");
            
        } else {
            
            double cafeRestante = cantidadCafe - ( cafeteraEj.getCapacidadMaxima() - cafeteraEj.getCapacidadActual() );
            
             cafeteraEj.setCapacidadActual( cafeteraEj.getCapacidadMaxima() );
             
             System.out.println("Sobró " + cafeRestante + "ml de café. La cafetera se rellenó completamente.");
        }
    }
}
