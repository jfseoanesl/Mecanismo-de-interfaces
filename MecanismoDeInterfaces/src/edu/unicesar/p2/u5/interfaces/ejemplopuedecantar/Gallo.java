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
public class Gallo implements PuedeCantar {

    @Override
    public void cantar() {
        System.out.println("El gallo canta Cocorollo, Cocorollo....");
    }
    
}
