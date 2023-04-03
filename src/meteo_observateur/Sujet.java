package meteo_observateur;

public interface Sujet {
//Ajouter un observateur

    void enregisterObservateur(Observateur obs);
//Supperimer un observateur

    void supprimerObservateur(Observateur obs);
//notifier un observateur de qq chose nouvelle

    void notifierObservateurs();

}
