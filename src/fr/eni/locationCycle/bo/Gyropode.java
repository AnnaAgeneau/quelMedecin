package fr.eni.locationCycle.bo;

import java.time.LocalDate;
import java.util.Date;

/**
 * Gyropode
 *
 * tailleMinimum en centimètre
 *
 */

public class Gyropode extends CycleElectrique{
    public int mTailleMin;

    public Gyropode(String mMarque, String mModele, LocalDate dateAchat, int mAutonomie, int mTailleMin) {
        super(mMarque, mModele, dateAchat, mAutonomie);
        this.mTailleMin = mTailleMin;
    }

    @Override
    public double getTarif() {
        return 29.90;
    }



    public void afficher(){
        System.out.printf("Marque Gyropode : %s%nModèle : %s%nAutonomie : %dKm%nTaille minimum de l'utilisateur : %dcm%n",
                this.mMarque, this.mModele, this.mAutonomie, this.mTailleMin);




    }


}
