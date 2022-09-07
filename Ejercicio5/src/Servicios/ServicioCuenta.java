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
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class ServicioCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {

        Cuenta cuentaEjemplo = new Cuenta();

        System.out.println("Ingrese el número de cuenta: ");
        cuentaEjemplo.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese el DNI: ");
        cuentaEjemplo.setDni(leer.nextLong());
        
        cuentaEjemplo.setInteres(0.20);
        
        return cuentaEjemplo;
    }

    public void ingreso(double ingreso, Cuenta cuentaEjemplo) {

        cuentaEjemplo.setSaldoActual(cuentaEjemplo.getSaldoActual() + (int) ingreso);
    }

    public void retiro(double retiro, Cuenta cuentaEjemplo) {

        if (retiro <= cuentaEjemplo.getSaldoActual()) {
            
            cuentaEjemplo.setSaldoActual(cuentaEjemplo.getSaldoActual() - (int) retiro);
        } else{
            
            System.out.println("Insuficiente dinero en la cuenta. Se retiró el dinero restante.");
            
            retiro = cuentaEjemplo.getSaldoActual();
            cuentaEjemplo.setSaldoActual(0);
        }
    }
    
    public void extraccionRapida ( Cuenta cuentaEjemplo ){
        
        double retiro = cuentaEjemplo.getSaldoActual() * 0.80;
        cuentaEjemplo.setSaldoActual( (int) retiro );
        
        System.out.println("Extracción realizada con éxito");
    }
    
    public void consultarSaldo ( Cuenta cuentaEjemplo ){
        
        System.out.println("Su saldo actual es de: $" + cuentaEjemplo.getSaldoActual());
    }
    
    public void consultarDatos ( Cuenta cuentaEjemplo ){
        
        System.out.println("Número de cuenta: " + cuentaEjemplo.getNumeroCuenta());
        System.out.println("DNI: " + cuentaEjemplo.getDni());
        System.out.println("Saldo actual: $" + cuentaEjemplo.getSaldoActual());
        System.out.println("Intereses: %" + cuentaEjemplo.getInteres() * 100);
    }
}
