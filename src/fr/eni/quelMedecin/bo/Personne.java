package fr.eni.quelMedecin.bo;

public class Personne {
    private String nom;
    private String prenom;
    private String numDeTelephone;

    public Personne(String nom, String prenom, String numDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numDeTelephone = numDeTelephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumDeTelephone() {
        return numDeTelephone;
    }

    public void setNumDeTelephone(String numDeTelephone) {
        this.numDeTelephone = numDeTelephone;
    }



}
