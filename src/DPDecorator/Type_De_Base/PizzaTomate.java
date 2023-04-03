package DPDecorator.Type_De_Base;

import DPDecorator.Component;
import DPDecorator.Decorator;

public class PizzaTomate implements Component {
    private String name;
    private static float price=3000;

    public PizzaTomate() {
    }

    public PizzaTomate(String name) {
        this.name = name;
    }

    public String getName(){return name;}
    public float getPrice(){return price;}

}
