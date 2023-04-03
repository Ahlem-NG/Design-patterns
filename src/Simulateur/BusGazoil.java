package Simulateur;

public  class BusGazoil extends Bus {

     public void rouler(String ch , int n){
        System.out.println("je suis un "+ ch +" je consomme "+n +"  du gazoil");
    }
    @Override
    public String toString() {
        return "BusGazoil";
    }
}
