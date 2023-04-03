/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meteo_observateur;

import java.util.ArrayList;

public class AffichageStatistique implements Observateur, Affichage {
       private ArrayList  temp;
       private ArrayList humid;
       private float moyHumidite=0;
        private float moyTemp=0;
       
private Sujet donneesMeteo;
public AffichageStatistique(Sujet dm){
this.donneesMeteo=dm; 
donneesMeteo.enregisterObservateur(this);
}
public void afficher() { 
System.out.println("Conditions actuelles:"+
moyTemp+" degrès et "+moyHumidite+" %d'hmidité");
}
public void actualiser(float t,float h, float p) { 
temp.add(t);
humid.add(h);

}
 public void statistique(){
 if (temp.size()>0){
     for(int i=0; i<temp.size(); i++){
         moyTemp +=(float)temp.get(i);
      
} 
     moyHumidite/=humid.size();}
     for(int i=0; i<humid.size(); i++){
         moyHumidite +=(float) humid.get(i);
      
 }
     moyHumidite/=temp.size();
   
 
 }

}
 

       

