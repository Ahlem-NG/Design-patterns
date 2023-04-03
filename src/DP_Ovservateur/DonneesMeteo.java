package DP_Ovservateur;

import java.util.ArrayList;
public class DonneesMeteo implements Sujet {

    private float temperature;
    private float humidite;
    private float pression;
    private ArrayList<Observateur> observateurs;


    public DonneesMeteo() {
     observateurs=new ArrayList<>();
    }

    @Override
    public void enregistrerObservateur(Observateur obs) {
        observateurs.add(obs);

    }

    @Override
    public void supprimerObservateur(Observateur obs) {
        int i = observateurs.indexOf(obs);
        if(i>=0) {
            observateurs.remove(obs);
        }
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observ : observateurs) {
            observ.actualiser( temperature, humidite, pression);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pression;
    }

    public void setMesures(float temperature , float humidite , float pression) {
        this.temperature = temperature;
        this.humidite=humidite;
        this.pression=pression;
        notifierObservateurs();
    }

    public void actualiserMesures() {
      notifierObservateurs();
    }
}
