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
public class Client {
    private String Nom, Prenom, Numero, lieuLivraison;
    private Livreur monLivreur;
    private Commande maCommande;

    public Client(){
        
    }
    
    public Client(String Nom, String Prenom, String Numero, String lieuLivraison) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Numero = Numero;
        this.lieuLivraison = lieuLivraison;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getLieuLivraison() {
        return lieuLivraison;
    }

    public void setLieuLivraison(String lieuLivraison) {
        this.lieuLivraison = lieuLivraison;
    }

    public void passerCommande(){
        System.out.println("Je passe une commande");
        
    }
 
    public void reglerCommande() {
        System.out.println("Je regle ma commande");
    }
    
}
