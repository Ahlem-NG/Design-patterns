package Simulateur;

public class BusGaz extends Bus{

            public void rouler(String ch , int n){
            System.out.println("je suis un "+ ch +" je consomme "+n +"  du gaz");
        }
    @Override
    public String toString() {
        return "BusGaz";
    }
}
