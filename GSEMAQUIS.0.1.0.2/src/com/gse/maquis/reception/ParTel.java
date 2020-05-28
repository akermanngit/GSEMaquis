/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gse.maquis.reception;

import com.gse.maquis.reception.Commande;

/**
 *
 * @author akermann
 */
public class ParTel extends Commande{

    public ParTel() {
    }

    public ParTel(int idCommande, String DateCom, EtatCommande StatutCommande) {
        super(idCommande, DateCom, StatutCommande);
    }

    
    
    
}
