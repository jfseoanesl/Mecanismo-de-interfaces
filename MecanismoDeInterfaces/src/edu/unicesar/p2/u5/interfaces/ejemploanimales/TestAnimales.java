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
public class TestAnimales {
    public static void main(String arg[]){
        
        PuedeCaminar caminan[]= new PuedeCaminar[2];
        caminan[0]= new Gato();
        caminan[1]= new Loro();
        
        Gato g = new Gato();
        g.camina();
        g.nada();
        
        for(int i=0; i< caminan.length;i++){
            caminan[i].camina();
        }
    }
}
