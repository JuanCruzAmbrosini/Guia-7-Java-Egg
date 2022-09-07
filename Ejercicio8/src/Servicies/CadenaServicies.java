/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicies;

import Entities.Cadena;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class CadenaServicies {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena creacionCadena() {

        Cadena cadenaEjemplo = new Cadena();

        System.out.println("Ingrese una palabra o frase.");
        cadenaEjemplo.setFrase(leer.next());

        cadenaEjemplo.setLongitudFrase(cadenaEjemplo.getFrase().length());

        return cadenaEjemplo;
    }

    public void contarVocales(Cadena cadenaEjemplo) {

        int cont = 0;

        for (int i = 0; i < cadenaEjemplo.getLongitudFrase(); i++) {

            if (cadenaEjemplo.getFrase().charAt(i) == 'a' || cadenaEjemplo.getFrase().charAt(i) == 'A' || cadenaEjemplo.getFrase().charAt(i) == 'e' || cadenaEjemplo.getFrase().charAt(i) == 'E' || cadenaEjemplo.getFrase().charAt(i) == 'i' || cadenaEjemplo.getFrase().charAt(i) == 'I' || cadenaEjemplo.getFrase().charAt(i) == 'o' || cadenaEjemplo.getFrase().charAt(i) == 'O' || cadenaEjemplo.getFrase().charAt(i) == 'u' || cadenaEjemplo.getFrase().charAt(i) == 'U') {

                cont++;
            }
        }

        System.out.println("La cantidad de vocales en la frase es de: " + cont);
    }

    public void invertirFrase(Cadena cadenaEjemplo) {

        String fraseAux = "";

        for (int i = 0; i < cadenaEjemplo.getLongitudFrase(); i++) {

            fraseAux = fraseAux.concat(cadenaEjemplo.getFrase().substring(cadenaEjemplo.getLongitudFrase() - i - 1, cadenaEjemplo.getLongitudFrase() - i));

        }
        System.out.println("La frase invertida es: " + fraseAux);
    }

    public void vecesRepetido(Cadena cadenaEjemplo) {

        int contador = 0;

        System.out.println("Ingrese la letra que desea contar dentro de la frase.");
        char letraBuscada = leer.next().charAt(0);
        
        for (int i = 0; i < cadenaEjemplo.getLongitudFrase(); i++) {

            if (cadenaEjemplo.getFrase().charAt(i) == letraBuscada) {

                contador++;
            }
        }
        if (contador == 0) {

            System.out.println("No se encontró la letra seleccionada.");

        } else {

            System.out.println("La letra seleccionada se repite " + contador + " veces.");
        }

    }

    public void unirFrases(Cadena cadenaEjemplo) {

        System.out.println("Ingrese una palabra o frase para agregarle a la primera.");
        String fraseNueva = leer.next();
        String fraseFinal = cadenaEjemplo.getFrase().concat(" ");

        fraseFinal = fraseFinal.concat(fraseNueva);

        System.out.println("La nueva frase sería: " + fraseFinal);
    }

    public void reemplazar(Cadena cadenaEjemplo) {

        System.out.println("Ingrese el carácter por el cual será reemplazada la letra a: ");
        String reemplazo = leer.next();

        String nuevaFrase = "";

        for (int i = 0; i < cadenaEjemplo.getLongitudFrase(); i++) {

            if (cadenaEjemplo.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {

                nuevaFrase = nuevaFrase.concat(reemplazo);

            } else {

                nuevaFrase = nuevaFrase.concat(cadenaEjemplo.getFrase().substring(i, i + 1));
            }
        }

        System.out.println(" La frase alterada sería: " + nuevaFrase);
    }

    public boolean contiene(Cadena cadenaEjemplo) {

        int contador = 0;

        System.out.println("Ingrese la letra que desea verificar si se encuentra: ");
        char letraABuscar = leer.next().charAt(0);

        for (int i = 0; i < cadenaEjemplo.getLongitudFrase(); i++) {

            if (cadenaEjemplo.getFrase().charAt(i) == letraABuscar) {

                contador++;
            } 
        }
        return (0 != contador);
        }
    }
