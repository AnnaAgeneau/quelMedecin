package fr.eni.quelMedecin.bo;

import java.time.LocalTime;

/**
 * création de la classe Créneau,
 */


public class Creneau {
    private MedecinGeneraliste medecin;
    private LocalTime heureDebut;
    private int duree;


    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
        this.medecin = medecin;
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin.ajouterCreneau(this);
    }


    public void afficher() {
        System.out.printf("%s - %s (%d minutes)%n",
        this.heureDebut,
        this.heureDebut.plusMinutes(this.duree),
        this.duree
        );
    }

    public MedecinGeneraliste getMedecin() {
        return medecin;
    }
}
