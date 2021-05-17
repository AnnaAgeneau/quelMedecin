package fr.eni.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient extends Personne {

    private final char sexe;
    private final long numSecSocial;
    private final LocalDate DateNaissance;
    private final String commentaires;
    private final Adresse adresse;


    public Patient(String nom,
                   String prenom,
                   String numDeTelephone,
                   char sexe,
                   long numSecSocial,
                   LocalDate dateNaissance,
                   String commentaires,
                   Adresse adresse) {
        super(nom, prenom, numDeTelephone);
        this.sexe = sexe;
        this.numSecSocial = numSecSocial;
        DateNaissance = dateNaissance;
        this.commentaires = commentaires;
        this.adresse = adresse;
    }



    public void afficher () {
        String commentaireModifie;
        if (this.commentaires == null) {
            commentaireModifie = "[aucun commentaire]";
        } else {
            commentaireModifie = this.commentaires;
        }

        //this.commentaires == null ? "[Aucun commentaires]" : this.commentaires; ternaire
        System.out.println(super.getNom().toUpperCase() + " " + super.getPrenom());
        System.out.println("Téléphone : " + super.getNumDeTelephone());
        /*if (this.sexe == 'F') {
            System.out.println("sexe : Féminin");
        } else {
            System.out.println("sexe : Masculin");
        }
        */
        System.out.println(this.sexe == 'F' ? "sexe : Féminin" : "sexe : Masculin");
        System.out.println("Numéro de Sécurité Sociale :" + this.numSecSocial);
        System.out.println("Date de naissance : " + this.DateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Commentaires :" + commentaireModifie);
        this.adresse.afficher();
    }


}
