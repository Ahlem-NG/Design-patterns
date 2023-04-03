package DP_Ovservateur;

import java.util.ArrayList;

public class AffichageStatistique implements Observateur ,Affichage {
    private ArrayList t;
    private ArrayList  h;
    private ArrayList p;
    protected Sujet donneesMeteo;

    @Override
    public void afficher() {

    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {

    }
}
