package com.mahjour.contact.model;
import com.google.gson.annotations.SerializedName;

public class contact {
    @SerializedName("nom")
    private String nom;

    public contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "contact{" +
                "nom='" + nom + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public contact(){

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @SerializedName("numero")
    private String numero;
}
