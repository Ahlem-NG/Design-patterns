package Simulateur;

public class VoitureElectrique extends Voiture{
    @Override
    public void rouler(String ch, int n) {
        System.out.println("je suis une "+ ch +" je consomme "+n +" w de l' electrique");
    }

    @Override
    public String toString() {
        return "VoitureElectrique";
    }
}
