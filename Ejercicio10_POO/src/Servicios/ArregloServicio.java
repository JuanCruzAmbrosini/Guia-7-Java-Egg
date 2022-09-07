/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Arrays;

/**
   Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
 */
public class ArregloServicio {
    
    //public Arreglo ar = new Arreglo();
    
    double arregloa[] = new double[50];
    double arreglob[] = new double[20];
    
    public void CargarArreglos(){
        for (int i = 0; i < arregloa.length; i++) {

            arregloa[i]= Math.round(Math.random()*100);   

        }
        for (int i = 0; i < arreglob.length; i++) {

            arreglob[i]=Math.round(Math.random()*100); 

        }
    }
    
    public void mostrarArreglos() {
        
        System.out.println(" "+Arrays.toString(arregloa));
        System.out.println(" "+Arrays.toString(arreglob));
        
        }
    
    public void OrdenarArregloA(){
        Arrays.sort(arregloa);
    }

     public void RemplazarAB() {
        Arrays.fill(arreglob,10,20,0.5);
        
        for (int i = 0; i < 10; i++) {
            if(i<10){
                arreglob[i]=arregloa[i]; 
            }
            }
        }
    }
