/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5;

import Entidades.Cuenta;
import Servicios.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean continuar = true;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioCuenta sc = new ServicioCuenta();

        Cuenta cuenta1 = sc.crearCuenta();

        int opcionSeleccionada;

        do {

            System.out.println("---------------------------------------------------");
            System.out.println("Seleccione la opción deseada: ");
            System.out.println("1) Ingreso.");
            System.out.println("2) Retiro.");
            System.out.println("3) Exteracción rápida.");
            System.out.println("4) Consulta de saldo.");
            System.out.println("5) Consulta de cuenta.");
            System.out.println("6) Salir");
            System.out.println("---------------------------------------------------");
            
            opcionSeleccionada = leer.nextInt();

            switch (opcionSeleccionada) {

                case 1:

                    System.out.println("Ingrese la cantidad de dinero a ingresar:");
                    double ingreso = leer.nextInt();
                    sc.ingreso(ingreso, cuenta1);
                    break;

                case 2:

                    System.out.println("Ingrese la cantidad de dinero a retirar:");
                    double retiro = leer.nextInt();
                    sc.retiro(retiro, cuenta1);
                    break;

                case 3:

                    sc.extraccionRapida(cuenta1);
                    break;
                    
                case 4:

                    sc.consultarSaldo(cuenta1);
                    break;
                    
                case 5:

                    sc.consultarDatos(cuenta1);
                    break;
                    
                case 6:
                    
                    continuar = false;
                    System.out.println("Gracias por utilizar nuestros servicios.");
                    break;
                    
                default:
                    
                    System.out.println("Ingrese un valor válido.");
            }
        } while ( continuar );
    }
}
