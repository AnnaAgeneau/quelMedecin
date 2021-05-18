package fr.eni.locationCycle.bo;

import java.time.LocalDate;

public abstract class CycleElectrique extends Cycles {
    protected int mAutonomie;

    public CycleElectrique(String mMarque, String mModele, LocalDate dateAchat, int mAutonomie) {
        super(mMarque, mModele, dateAchat);
        this.mAutonomie = mAutonomie;
    }
}
