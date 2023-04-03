package Simulateur;

public class CamionGazoil extends Camion{
    public void rouler(String ch , int n){
        System.out.println("je suis un "+ ch +" je consomme "+n +"  de gazoil");
    }

    @Override
    public String toString() {
        return "CamionGazoil";
    }
}
