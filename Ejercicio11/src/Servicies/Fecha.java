/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Servicies;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Fecha {
    
    private Scanner leer;

    public Fecha() {
        
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    public Date crearFecha (){
        
        System.out.println("Ingrese el dia deseado: ");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes deseado: ");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año deseado: ");
        int anio = leer.nextInt();
        
        Date fecha1 = new Date(anio - 1900 , mes - 1 , dia);
        
        return fecha1;
    }
    
    public int diferenciaAnios ( Date fechaEj ){
        
        Date fechaActual = new Date();
        
        int difAnio = fechaActual.getYear() - fechaEj.getYear();
        
        return difAnio;
    }
}
