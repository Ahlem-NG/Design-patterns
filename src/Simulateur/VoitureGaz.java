package Simulateur;

public  class VoitureGaz extends Voiture{
    public void rouler(String ch , int n){
        System.out.println("je suis une "+ ch +" je consomme"+n +"  du gaz");
    }

    @Override
    public String toString() {
        return "VoitureGaz";
    }
}
