package fr.eni.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient {
    private String nom;
    private String prenom;
    private String numDeTelephone;
    private char sexe;
    private long numSecSocial;
    private LocalDate DateNaissance;
    private String commentaires;


    public Patient(String nom,
                   String prenom,
                   String numDeTelephone,
                   char sexe,
                   long numSecSocial,
                   LocalDate DateNaissance,
                   String commentaires) {

        this.nom = nom;
        this.prenom = prenom;
        this.numDeTelephone = numDeTelephone;
        this.sexe = sexe;
        this.numSecSocial = numSecSocial;
        this.DateNaissance = DateNaissance;
        this.commentaires = commentaires;

    }

    public void afficher () {
        String commentaireModifie;
        if (this.commentaires == null) {
            commentaireModifie = "[aucun commentaire]";
        } else {
            commentaireModifie = this.commentaires;
        }

        //this.commentaires == null ? "[Aucun commentaires]" : this.commentaires; ternaire
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
        System.out.println("Téléphone : " + this.numDeTelephone);
        /*if (this.sexe == 'F') {
            System.out.println("sexe : Féminin");
        } else {
            System.out.println("sexe : Masculin");
        }
        */
        System.out.println(this.sexe == 'F' ? "sexe : Féminin" : "sexe : Masculin");
        System.out.println("Numéro de Sécurité Sociale :" + this.numSecSocial);
        System.out.println("Date de naissance : " + this.DateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Commentaires :" + this.commentaires);

    }

}
