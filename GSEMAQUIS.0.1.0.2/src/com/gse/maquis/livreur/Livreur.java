/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gse.maquis.livreur;

import com.gse.maquis.reception.Commande;
import com.gse.maquis.reception.Commande;
import com.gse.maquis.client.Client;

/**
 *
 * @author akermann 
 */
public class Livreur {
    private String nomLivreur = " ", numero = " ", position = " "; 
    private String[] pointLiv = new String[10];
    private Commande CommandeCl;
    private Client positionClient;
    
    public Livreur() {}

    
    public Livreur(String nomDuLivreur, String numeroLiv, String positionLiv,
            String[] pointDeLivraison) {
        this.nomLivreur = nomDuLivreur;
        this.numero = numeroLiv;
        this.position = positionLiv;
        this.pointLiv = pointDeLivraison;
    }

    public Livreur(Commande CommandeCl, Client positionClient) {
        this.CommandeCl = CommandeCl;
        this.positionClient = positionClient;
    }
    
    

    public String getNomLivreur() {
        return nomLivreur;
    }

    public void setNomLivreur(String nomLivreur) {
        this.nomLivreur = nomLivreur;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
     public String[] getPointLiv() {
        return pointLiv;
    }

    public void setPointLiv(String[] pointLiv) {
        this.pointLiv = pointLiv;
    }
    
 
    public Client getPositionClient() {
        return positionClient;
    }

    public void setPositionClient(Client positionClient) {
        this.positionClient = positionClient;
    }
    
    public Commande getCommandeCl() {
        return CommandeCl;
    }

    public void setCommandeCl(Commande CommandeCl) {
        this.CommandeCl = CommandeCl;
    }
    
    public String Livrer(String lieuLivraison) {
        positionClient.setLieuLivraison(lieuLivraison);
        String status = "";
            for (String pointLiv1 : pointLiv) {
            if ((this.position == null ? pointLiv1 == null : this.position.
                    equals(pointLiv1)) && (this.position == null ? positionClient
                            .getLieuLivraison() == null : this.position.
                                    equals(positionClient.getLieuLivraison()))){
                    System.out.println("Commande du client Bien livrée");
                    status = positionClient.
                            getNom()+positionClient.getPrenom()+positionClient.
                                    getNumero()+"LIVREE";
            }else {
                    System.out.println("Commande du client en cours de livraison,"
                            + " veuillez svp patienter");
                    status = positionClient.
                            getNom()+positionClient.getPrenom()+positionClient.
                                    getNumero()+"PAS LIVREE";
                    }
     }
    return status;        
    }  
}
