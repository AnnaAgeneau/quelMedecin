package fr.eni.quelMedecin.bo;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * création de la classe RDV
 * un patient doit poser un RDV avec un médecin spécifique sur un créneau choisi
 */
public class RendezVous {
    private Patient patient;
    private Creneau creneauHoraire;
    private LocalDate date;


    public RendezVous(Creneau creneauHoraire, Patient patient,
                             LocalDate date) {
        this.patient = patient;
        this.creneauHoraire = creneauHoraire;
        this.date = date;
    }

    public void afficher() {
        System.out.printf("Rendez-vous du : %s ",
                this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.creneauHoraire.afficher();
        System.out.println("Avec le Dr " + this.creneauHoraire.getMedecin().getNom());
        System.out.print("pour ");
        this.patient.afficher();


    }
}
