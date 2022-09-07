/*
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package service;

import entidades.Arreglo;
import java.util.Arrays;

/**
 *
 * @author Raul
 */
public class ServiceArreglo {

    private Arreglo a1;

    public ServiceArreglo() {
        a1 = new Arreglo();
    }

    public Arreglo llenarArreglo() {
        System.out.println("arreglo 1");
        for (int i = 0; i < 50; i++) {
            a1.getArreglo1()[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(a1.getArreglo1()));
        System.out.println("");
        System.out.println("arreglo 2");
        for (int i = 0; i < 20; i++) {
            a1.getArreglo2()[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(a1.getArreglo2()));
        Arrays.sort(a1.getArreglo1());
        System.out.println("");
        System.out.println("Arreglo 1 ordenado de menor a mayor");
        System.out.println(Arrays.toString(a1.getArreglo1()));

        System.out.println("Arreglo 2 con pos 1 a 20 copiada de Arreglo 1");
        a1.setArreglo2(Arrays.copyOf(a1.getArreglo1(), 10));
        System.out.println(Arrays.toString(a1.getArreglo2()));
        System.out.println("Arreglo 2 con pos 10 a 20 reemplazada por 0,5");
        Arrays.fill(a1.getArreglo2(), 10, 20, 0.5);
        System.out.println(Arrays.toString(a1.getArreglo2()));
        return a1;
    }

}
