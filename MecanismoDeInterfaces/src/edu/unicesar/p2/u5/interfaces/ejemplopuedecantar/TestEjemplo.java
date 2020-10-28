/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u5.interfaces.ejemplopuedecantar;

/**
 *
 * @author jairo
 */
public class TestEjemplo {
    public static void main(String arg[]){
        
        PuedeCantar p[] = new PuedeCantar[2];
        p[0] = new Persona();
        p[1]= new Gallo();
        
        for(int i=0; i<p.length; i++){
            p[i].cantar();
        }
    }
}
