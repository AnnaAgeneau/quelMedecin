package fr.eni.quelMedecin.bo;

import java.util.Locale;

/**
 * classe qui représente un médecin
 * @date 12/05/2021
 * @version v1.0
 * @author Ageneau Anna
 *
 */
public class MedecinGeneraliste {
    // chaque médecin donc different donc attribut instance
    private String nom;
    private String prenom;
    private String numeroDeTelephone;

    // tarif pour tous les médecins donc attributs de classe
    private static int tarif = 25;



    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;

    }

    /**
     * affiche sous la forme :
     * NOM prénom
     * téléphone  : xxxxxxx
     * tarif : XX€
     */
    public void afficher() {
        System.out.printf("Médecin Généraliste : %s %s  %n Téléphone : %s %n Tarif de la consultation : %s€ %n",
                this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone, MedecinGeneraliste.tarif);
    }

    public String getNom() {
        return nom;
    }


    public int getTarif() {
        return tarif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    public void setNumeroDeTelephone(String s) {
        this.numeroDeTelephone = numeroDeTelephone;
    }


    public Object getNumeroDeTelephone() {
        return numeroDeTelephone;
    }
}



