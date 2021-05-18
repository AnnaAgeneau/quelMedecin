package fr.eni.locationCycle.bo;

import java.time.LocalDate;
import java.util.Date;

public abstract class  Cycles {
    protected String mMarque;
    protected String mModele;
    protected LocalDate dateAchat;

    public Cycles(String mMarque, String mModele, LocalDate dateAchat) {
        this.mMarque = mMarque;
        this.mModele = mModele;
        this.dateAchat = dateAchat;
    }

    public int age() {
        return this.dateAchat.until(LocalDate.now()).getYears();
    }

    //je crée une méthode vide tarif ici, puis je la mets dans les classes filles
    public abstract double getTarif();



}
