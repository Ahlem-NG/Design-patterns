package Simulateur;

public class BusElectrique extends Bus {
    @Override
    public void rouler(String ch, int n) {
        System.out.println("je suis un "+ ch +" je consomme "+n +" w de l' electrique");
    }

    @Override
    public String toString() {
        return "BusElectrique";
    }
}
