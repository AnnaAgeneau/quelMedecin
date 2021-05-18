package fr.eni.locationCycle.bo;

import java.time.LocalDate;
import java.util.Date;

public class GyroRoue extends CycleElectrique{

    @Override
    public double getTarif() {
        return 18.90;
    }

    public GyroRoue(String mMarque, String mModele, LocalDate dateAchat, int mAutonomie) {
        super(mMarque, mModele, dateAchat, mAutonomie);
    }

    public void afficher(){
        System.out.printf("Marque GyroRoue : %s%nModèle : %s%nAutonomie : %dKm%n",
                this.mMarque, this.mModele, this.mAutonomie);

    }


}
