/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u5.interfaces.ejemploanimales;

/**
 *
 * @author jairo
 */
public class Gato extends Mamifero implements PuedeNadar  {

    @Override
    public void camina() {
        System.out.println("El Gato camina 123 pasos....");
    }

    @Override
    public void nada() {
        System.out.println("El Gato se sumerge 123 segundos....");
    }
    
}
