package DP_Ovservateur;

public interface Sujet {

    public void enregistrerObservateur(Observateur observateur);
    public void supprimerObservateur(Observateur observateur);
    public void notifierObservateurs();
}
