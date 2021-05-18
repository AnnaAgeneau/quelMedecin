package fr.eni.locationCycle.bo;


import java.time.LocalDate;

public class Main {

    public static void main(String [] args){
        Cycles[] aLouer = new Cycles[6];
        Velo lapierre = new Velo("lapierre", "speed 400", 27, LocalDate.of(2018,6,21));
        aLouer[0] = lapierre;

        for (int laCase = 0; laCase< aLouer.length; laCase++){
            if (aLouer[laCase] != null){
                System.out.println(aLouer[laCase]);
            }
        }

        /*
        System.out.println("**************** Location Vélo **********************");
        System.out.println("");
        Velo lapierre = new Velo("Lapierre", "Speed (400)", 27);
        Velo btwin = new Velo("Btwin", "riverside (900)",10);
        lapierre.afficher();
        System.out.println("");
        btwin.afficher();
        System.out.println("");
        System.out.println("**************** Location Gyropode **********************");
        System.out.println("");
        Gyropode segwayNe = new Gyropode("Segway Ninebot", "Elite", 150, 40);
        Gyropode weebot = new Gyropode("Weebot", "Echo", 160,35);
        segwayNe.afficher();
        System.out.println("");
        weebot.afficher();
        System.out.println("**************** Location GyroRoue **********************");
        System.out.println("");
        GyroRoue immotion = new GyroRoue("Immotion", "V8", 40);
        GyroRoue segwayNo = new GyroRoue("Segway Ninebot", "One E", 30);
        immotion.afficher();
        System.out.println("");
        segwayNo.afficher();
        */
    }
}
