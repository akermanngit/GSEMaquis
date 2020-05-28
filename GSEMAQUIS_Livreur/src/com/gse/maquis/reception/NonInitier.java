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
public class NonInitier implements EtatCommande {
    public void suisCommande () {
        System.out.println("La livrraison n'a pas commencé");
    }
    
}
