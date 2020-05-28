/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gse.maquis.reception;

import com.gse.maquis.livreur.Livreur;
import com.gse.maquis.client.Client;

/**
 *
 * @author akermann
 */
abstract public class Commande implements EtatCommande {
    private int idCommande;
    private String DateCom;
    private EtatCommande statutCommande = new Clos();
    private Client comClient;
    private Livreur comLivreur;


    public Commande(int numDeCommande, String DateCommande, Client commandeClient, Livreur commandeLivreur) {
        this.idCommande = numDeCommande;
        this.DateCom = DateCommande;
        this.comClient = commandeClient;
        this.comLivreur = commandeLivreur;
    }

    public Commande() {}
    
    public Commande(int numDeCommande, String DateDeCommande, EtatCommande StatutDeCommande) {
        this.idCommande = numDeCommande;
        this.DateCom = DateDeCommande;
        this.statutCommande = StatutDeCommande;
    }
   
        public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Client getComClient() {
        return comClient;
    }

    public void setComClient(Client comClient) {
        this.comClient = comClient;
    }

    public Livreur getComLivreur() {
        return comLivreur;
    }

    public void setComLivreur(Livreur comLivreur) {
        this.comLivreur = comLivreur;
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
