/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gse.maquis;

/**
 *
 * @author akermann
 */
public class Enligne extends Commande{

    public Enligne() {}

    public Enligne(String numeroCommande, String DateCom, EtatCommande StatutCommande) {
        super(numeroCommande, DateCom, StatutCommande);
    }
    
}
