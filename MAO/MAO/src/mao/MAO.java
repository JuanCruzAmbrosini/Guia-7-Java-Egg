/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mao;

import entidad.Persona;
import servicio.ServicioPersona;

/**
 *
 * @author Juan Cruz
 */
public class MAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", "Perez", 33);

        Persona p2 = new Persona();

        p2.setNombre("Carlos");
        p2.setApellido("Sanchez");
        p2.setEdad(27);
        
        ServicioPersona p = new ServicioPersona();
        
        p.mostrarPersona(p1);
        p.mostrarPersona(p2);
        
    }

}
