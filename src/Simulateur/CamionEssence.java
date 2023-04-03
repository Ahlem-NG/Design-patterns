package Simulateur;

public class CamionEssence extends Camion{
    public void rouler(String ch , int n){
        System.out.println("je suis un "+ ch +" je consomme "+n +"  de l' Essence");
    }
    @Override
    public String toString() {
        return "CamionEssence";
    }
}
