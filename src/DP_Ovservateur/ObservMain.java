package DP_Ovservateur;

import java.util.ArrayList;

public class ObservMain {
    public static void main (String[]args){
         //ArrayList<Observateur> observateurs=new ArrayList<Observateur>();


        Sujet donneesMeteo = new DonneesMeteo();
        AffichageConditions affichageConditions = new AffichageConditions(donneesMeteo);


        affichageConditions.actualiser(12,11,10);




    }
}
