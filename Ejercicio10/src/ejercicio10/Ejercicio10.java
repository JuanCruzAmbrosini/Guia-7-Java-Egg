/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < arregloA.length; i++) {

            arregloA[i] = Math.round(Math.random() * 11);
        }

        for (int i = 0; i < arregloB.length; i++) {

            arregloB[i] = Math.round(Math.random() * 11);
        }

        System.out.println(" " + Arrays.toString(arregloA));
        System.out.println(" " + Arrays.toString(arregloB));

        Arrays.sort(arregloA);

        Arrays.fill(arregloB, 0.5);

        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        System.out.println("-------------------------------------------------------");

        System.out.println(" " + Arrays.toString(arregloA));
        System.out.println(" " + Arrays.toString(arregloB));
    }

}
