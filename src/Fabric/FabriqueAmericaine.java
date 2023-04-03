package Fabric;

public class FabriqueAmericaine extends FabriquePizza {
   // private static String typeFrommage="fromagers fondu";
    @Override
    public Object creerObjet() {
        PizzaFruitdemere pizzaFruitdemere;
        return new PizzaFruitdemere();
    }
}
