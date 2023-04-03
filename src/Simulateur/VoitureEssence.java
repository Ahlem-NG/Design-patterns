package Simulateur;

public  class VoitureEssence extends Voiture {
    public void rouler(String ch , int n){
        System.out.println("je suis une "+ ch +" je consomme "+ n +"  Litre de l' Essence");
    }

    @Override
    public String toString() {
        return "VoitureEssence";
    }
}
