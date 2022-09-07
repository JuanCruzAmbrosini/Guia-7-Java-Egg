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
package ejercicio9;

import Entities.Matematica;
import Servicies.MatematicaService;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MatematicaService ms = new MatematicaService();
        
        Matematica operacion1 = ms.crearMatematica();
        System.out.println("------------------------------------------------------------------");
        System.out.println("El mayor de los 2 números generados aleatoriamente será:  " + ms.devolverMayor(operacion1));
        System.out.println("------------------------------------------------------------------");
        System.out.println("El mayor de los números a la potencia del menor: " + ms.calcularPotencia(operacion1));
        System.out.println("------------------------------------------------------------------");
        System.out.println("La raíz cuadrada del menor de los números: " + ms.calcularRaiz(operacion1));
        System.out.println("------------------------------------------------------------------");
        
        System.out.println(operacion1);
    }
    
}
