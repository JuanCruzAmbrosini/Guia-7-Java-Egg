/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;

/**
 *
 * @author Juan Cruz
 */
public class ServicioPersona {

    public void mostrarPersona(Persona p) {

        System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getEdad());

    }

}
