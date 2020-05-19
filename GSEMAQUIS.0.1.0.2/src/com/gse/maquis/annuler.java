/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gse.maquis;

/**
 *
 * @author akermann Name <Learn&Recycle_Java&Cpp >
 */
public class annuler implements EtatCommande {

    public annuler() {
    }

    @Override
    public void suisCommande() {
        System.out.println("La commande a été annulée");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
