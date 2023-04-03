package DP_Ovservateur;

public class AffichageConditions implements Observateur ,Affichage{
    private float temperature;
    private float humidite;
    private float pression;
    private Sujet donneesMeteo;

    public AffichageConditions(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {
        System.out.println("conditions actuelles : "+temperature +"°C et "+humidite+" %d'humidite et "+pression+" pression");
    }

    @Override
    public void actualiser(float temperature,float humidite,float pression) {
       this.temperature=temperature;
       this.humidite=humidite;
       this.pression=pression;
       afficher();
    }
}
