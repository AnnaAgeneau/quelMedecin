package fr.eni.quelMedecin.bo;

public class MedecinSpecialiste extends Personne {

    private Adresse adresse;
    private Creneau[] creneaux = new Creneau[15];
    private String specialite;

    // tarif pour tous les médecins donc attributs de classe
    private static int tarif = 52;

    public MedecinSpecialiste(String nom,
                              String prenom,
                              String numDeTelephone,
                              Adresse adresse,
                              String specialite,
                              int tarif) {
        super(nom, prenom, numDeTelephone);
        this.adresse = adresse;
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public void afficher() {
        System.out.printf("%s %s  %nTéléphone : %s %n Tarif : %d€ %n Adresse :",
                super.getNom().toUpperCase(), super.getPrenom(),
                super.getNumDeTelephone(), tarif);
        this.adresse.afficher();
        for (int i = 0; i < this.creneaux.length; i++){
            if (this.creneaux[i] != null) {
                this.creneaux[i].afficher();
            }
        }
        System.out.println(this.specialite
        );

    }




    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Creneau[] getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(Creneau[] creneaux) {
        this.creneaux = creneaux;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public static int getTarif() {
        return tarif;
    }

    public static void setTarif(int tarif) {
        MedecinSpecialiste.tarif = tarif;
    }

    public void ajouterCreneau(Creneau creneau) {
    }
}
