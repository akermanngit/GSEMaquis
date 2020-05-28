/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gse.maquis.reception;

/**
 *
 * @author akermann Name <Learn&Recycle_Java&Cpp >
 */
public class TypeRepas {

    public TypeRepas(int idTypeRepas, int idCommande, String nomPlatCom, double prixPlat, Commande typrepCommand) {
        this.idTypeRepas = idTypeRepas;
        this.idCommande = idCommande;
        this.nomPlatCom = nomPlatCom;
        this.prixPlat = prixPlat;
        this.typrepCommand = typrepCommand;
    }

    public TypeRepas() {
    }
    private int idTypeRepas, idCommande;
    private String nomPlatCom;
    private double prixPlat ;
    
    private Commande typrepCommand;

    public int getIdTypeRepas() {
        return idTypeRepas;
    }

    public void setIdTypeRepas(int idTypeRepas) {
        this.idTypeRepas = idTypeRepas;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public String getNomPlatCom() {
        return nomPlatCom;
    }

    public void setNomPlatCom(String nomPlatCom) {
        this.nomPlatCom = nomPlatCom;
    }

    public double getPrixPlat() {
        return prixPlat;
    }

    public void setPrixPlat(double prixPlat) {
        this.prixPlat = prixPlat;
    }

    public Commande getTyprepCommand() {
        return typrepCommand;
    }

    public void setTyprepCommand(Commande typrepCommand) {
        this.typrepCommand = typrepCommand;
    }
}
