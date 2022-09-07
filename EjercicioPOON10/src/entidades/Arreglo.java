package entidades;

import java.util.Arrays;

public class Arreglo {

    private double[] arreglo1 = new double[50];
    private double[] arreglo2 = new double[20];

    public double[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(double[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public double[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(double[] arreglo2) {
        if (arreglo2.length<= 20){
            for (int i = 0 ; i < arreglo2.length ; i++){
                this.arreglo2[i] = arreglo2[i];

        }
        }
    }
    
        
    public Arreglo() {
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arreglo1=" + Arrays.toString(arreglo1) + ", arreglo2=" + Arrays.toString(arreglo2) + '}';
    }

}
