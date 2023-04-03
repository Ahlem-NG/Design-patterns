
package meteo_observateur;


public class AffichageConditions implements Observateur, Affichage {

private float temperature; 
private float humidite; 
private Sujet donneesMeteo;
public AffichageConditions(Sujet dm){
this.donneesMeteo=dm; 
donneesMeteo.enregisterObservateur(this);
}
public void afficher() { 
System.out.println("Conditions actuelles:"+
temperature+" degrès et "+humidite+" %d'hmidité");
}
public void actualiser(float t,float h, float p) { 
temperature=t;
humidite=h;
afficher();
}

    
} 

