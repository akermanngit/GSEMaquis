/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gse.maquis.reception;

import com.gse.maquis.reception.EtatCommande;

/**
 *
 * @author akermann
 */
public class Encours implements EtatCommande {
    public void suisCommande () {
        System.out.println("La commande est en cours");
    }
    
}
