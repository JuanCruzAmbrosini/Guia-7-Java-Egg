/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Fraccion;
import java.util.Scanner;

/**
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y
 * numerador de cada fracción). Crear la clase servicio que contenga métodos
 * para sumar, restar, multiplicar y dividir fracciones. Mostrar por pantalla un
 * menú de opciones para que el usuario decida que ver.
 *
 * @author elias
 */
public class servicioFraccion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Fraccion crearFraccion() {
        Fraccion fr = new Fraccion();
        System.out.println("Primera Fracción");
        System.out.print("Digite el numero del numerador 1: ");
        fr.setNumerador1(leer.nextInt());
        do {
            System.out.print("Digite el numero del denominador 1: ");
            fr.setDenominador1(leer.nextInt());
        } while (fr.getDenominador1() == 0);
        System.out.print("Digite el numero del numerador 2: ");
        fr.setNumerador2(leer.nextInt());
        do {
            System.out.print("Digite el numero del denominador 2: ");
            fr.setDenominador2(leer.nextInt());
        } while (fr.getDenominador2() == 0);

        System.out.println("------------------------------------------------------");

        System.out.print("La fracción 1 simplificada es: ");
        simplificarFraccion(fr.getNumerador1(), fr.getDenominador1());
        System.out.print("La fraccion 2 simplificada es: ");
        simplificarFraccion(fr.getNumerador2(), fr.getDenominador2());

        return fr;
    }

    public void sumarFracciones(Fraccion fraccionEj) {

        int numerador = (fraccionEj.getNumerador1() * fraccionEj.getDenominador2()) + (fraccionEj.getNumerador2() * fraccionEj.getDenominador1());
        int denominador = fraccionEj.getDenominador2() * fraccionEj.getDenominador1();

        System.out.print("La suma de ambas fracciones es: ");
        simplificarFraccion(numerador, denominador);
    }

    public void restarFracciones(Fraccion fraccionEj) {

        int numerador = (fraccionEj.getNumerador1() * fraccionEj.getDenominador2()) - (fraccionEj.getNumerador2() * fraccionEj.getDenominador1());
        int denominador = fraccionEj.getDenominador2() * fraccionEj.getDenominador1();

        System.out.print("La resta de ambas fracciones es: ");
        simplificarFraccion(numerador, denominador);

    }

    public void multiplicarFracciones(Fraccion fraccionEj) {

        int numerador = fraccionEj.getNumerador1() * fraccionEj.getNumerador2();
        int denominador = fraccionEj.getDenominador1() * fraccionEj.getDenominador2();

        System.out.print("La multiplicación de ambas fracciones es: ");
        simplificarFraccion(numerador, denominador);

    }

    public void dividirFracciones(Fraccion fraccionEj) {

        int numerador = fraccionEj.getNumerador1() * fraccionEj.getDenominador2();
        int denominador = fraccionEj.getDenominador1() * fraccionEj.getNumerador2();

        System.out.print("La divición de ambas fracciones es: ");
        simplificarFraccion(numerador, denominador);

    }

    public void simplificarFraccion(int numerador, int denominador) {

        int mcm = 0;

        if (numerador > denominador) {

            for (int i = Math.abs(denominador); i > 0; i--) {

                if (denominador % i == 0 && numerador % i == 0) {
                    mcm = i;

                    numerador = numerador / mcm;
                    denominador = denominador / mcm;

                }
            }

            System.out.println(numerador + "/" + denominador);

        } else if (numerador < denominador && numerador != 0) {

            for (int i = Math.abs(numerador); i > 0; i--) {

                if (denominador % i == 0 && numerador % i == 0) {
                    mcm = i;

                    numerador = numerador / mcm;
                    denominador = denominador / mcm;

                }
            }

            System.out.println(numerador + "/" + denominador);

        } else if (numerador == denominador) {

            System.out.println("1");

        } else if (numerador == 0) {

            System.out.println("0");

        }
    }
    
    public void clear (){
        
        for (int i = 0; i < 25; i++) {
            
            System.out.println("\n");
            
        }
        
    }
    
}
