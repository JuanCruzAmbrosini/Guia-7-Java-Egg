/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
        al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicies;

import Entities.Matematica;

/**
 *
 * @author Juan Cruz
 */
public class MatematicaService {

    public Matematica crearMatematica() {

        Matematica mathEjemplo = new Matematica();

        mathEjemplo.setNumero1(Math.random() * 11);
        mathEjemplo.setNumero2(Math.random() * 11);
        
        System.out.println("Número 1: " + mathEjemplo.getNumero1());
        System.out.println("Número 2: " + mathEjemplo.getNumero2());

        return mathEjemplo;
    }

    public double devolverMayor(Matematica mathEjemplo) {

        double mayorNumero = Math.max(mathEjemplo.getNumero1(), mathEjemplo.getNumero2());

        return mayorNumero;
    }

    public int calcularPotencia(Matematica mathMatematica) {

        double primerNumero = Math.round(mathMatematica.getNumero1());
        double SegundoNumero = Math.round(mathMatematica.getNumero2());
        int potencia = (int) Math.pow(Math.max(primerNumero, SegundoNumero), Math.min(primerNumero, SegundoNumero));
        
        return potencia;
    }
    
    public double calcularRaiz ( Matematica mathEjemplo){
        
        double menorNumero = Math.min(mathEjemplo.getNumero1(), mathEjemplo.getNumero2());
        menorNumero = Math.abs(menorNumero);
        
        return Math.sqrt(menorNumero);
    }
}
