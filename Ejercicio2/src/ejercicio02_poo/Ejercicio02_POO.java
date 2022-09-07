/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi *Radio al 2).
e) Método perimetro(): para calcular el perímetro (Perimietro = 2 * pi * radio).
 */
package ejercicio02_poo;

import Entidades.Circunferencia;
import Servicios.ServicioCircunferencia;

/**
 *
 * @author pablo
 */
public class Ejercicio02_POO {

    public static void main(String[] args) {
    
        Circunferencia circ= new Circunferencia(0);
        
        ServicioCircunferencia serv= new ServicioCircunferencia();
        
        serv.crearCircunferencia(circ);
        double Area =serv.Area(circ);
        double Perimetro=serv.Perimetro(circ);
        
        System.out.println("El Area es: "+Area + " Y el perimetro es: "+Perimetro );
    }
    
}
