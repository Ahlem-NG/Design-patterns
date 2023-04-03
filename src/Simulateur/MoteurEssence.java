package Simulateur;

public  class MoteurEssence extends Vehicules{
    public void rouler(String ch , int n){
        System.out.println("je suis un "+ ch +" je consomme "+n +" litre de l' Essence");
    }
    @Override
    public String toString() {
        return "MoteurEssence";
    }
}
