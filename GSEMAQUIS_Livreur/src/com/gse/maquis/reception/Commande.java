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
abstract public class Commande implements EtatCommande {
    private String numeroCommande;
    private String DateCom;
    private EtatCommande statutCommande = new Clos();
    private Client comClient;

    public Commande() {}
    
    public Commande(String numeroCommande, String DateCom, EtatCommande StatutCommande) {
        this.numeroCommande = numeroCommande;
        this.DateCom = DateCom;
        this.statutCommande = StatutCommande;
    }
    
    /**
     * @return the numeroCommande
     */
    public String getNumeroCommande() {
        return numeroCommande;
    }

    /**
     * @param numeroCommande the numeroCommande to set
     */
    public void setNumeroCommande(String numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    /**
     * @return the DateCom
     */
    public String getDateCom() {
        return DateCom;
    }

    /**
     * @param DateCom the DateCom to set
     */
    public void setDateCom(String DateCom) {
        this.DateCom = DateCom;
    }

    /**
     * @return the statutCommande
     */
    public EtatCommande getStatutCommande() {
        return statutCommande;
    }

    /**
     * @param statutCommande the statutCommande to set
     */
    public void setStatutCommande(EtatCommande statutCommande) {
        this.statutCommande = statutCommande;
    }
    
    
    public void recoisCommande() {
        comClient.passerCommande();
        System.out.println("Je recois votre commande");
    }
    
    public void recoisReglement () {
        comClient.reglerCommande();
        System.out.println("Nous avons bien recu votre reglement");
    }
    
    @Override
    public void suisCommande() {
        getStatutCommande().suisCommande();
        
    }

    
}
