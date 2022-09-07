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
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ServicioCircunferencia {
    Scanner leer = new Scanner(System.in); 
    public void crearCircunferencia(Circunferencia circ){ 
        System.out.println("Ingrese el Radio");
        circ.setRadio(leer.nextDouble());
}
    public double Area(Circunferencia circ){

        return (Math.PI * circ.getRadio()*circ.getRadio() ); 
}
   public double Perimetro(Circunferencia circ){

        return (Math.PI * circ.getRadio()*2); 
}
}