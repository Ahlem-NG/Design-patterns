package Fabric;

public class FabriqueTunisienne extends FabriquePizza {
   // private static String typeFrommage="Fromage blanc";

    public FabriqueTunisienne() {
    }

    @Override
    public Object creerObjet() {
        Pizza4Frommage pizza4Frommage;
        return new Pizza4Frommage();
    }
}
