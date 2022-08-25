/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Entidades;

import Servicios.Operacion;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {

        System.out.println("Ingrese el primer valor: ");
        int numero1 = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el segundo valor: ");
        int numero2 = leer.nextInt();
        leer.nextLine();

        return new Operacion(numero1, numero2);
    }

    public int sumar(Operacion nOperacion) {

        int suma = nOperacion.getNumero1() + nOperacion.getNumero2();

        return suma;
    }

    public int restar(Operacion nOperacion) {

        int resta = nOperacion.getNumero1() - nOperacion.getNumero2();

        return resta;
    }

    public int multiplicar(Operacion nOperacion) {

        if (nOperacion.getNumero1() != 0 && nOperacion.getNumero2() != 0) {

            int multi = nOperacion.getNumero1() * nOperacion.getNumero2();
            return multi;
        } else {

            System.out.println("Ha habido un error!");

            return 0;
        }
    }

    public double dividir (Operacion nOperacion) {

        if (nOperacion.getNumero2() != 0) {

            double divid = (double) nOperacion.getNumero1() / nOperacion.getNumero2();
            return divid;
        } else {

            System.out.println("Ha habido un error!");

            return 0;
        }
    }
}
