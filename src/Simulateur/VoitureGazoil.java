package Simulateur;

public  class VoitureGazoil extends Voiture{

    public void rouler(String ch , int n){
        System.out.println("je suis une "+ ch +" je consomme"+n +"  du gazoil");
    }

    @Override
    public String toString() {
        return "VoitureGazoil";
    }
}
