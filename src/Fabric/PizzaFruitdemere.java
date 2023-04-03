package Fabric;

public class PizzaFruitdemere extends Pizza{

    public PizzaFruitdemere() {
    }

    @Override
    public void preparerPate() {
        System.out.println("Pate pizza fruits de mer encours de preparation");
    }

    @Override
    public void preparerSauce() {
        System.out.println("sauce pizza fruits de mer encours de preparation");
    }
}
