package DPDecorator.Supplement;

import DPDecorator.Component;
import DPDecorator.Decorator;

public class Legumes extends Decorator {
    protected static float price=4000;
    public Legumes() {

    }
    public Legumes(String name, Component component) {
        super(name,component);

    }


    public float getPrice() {

        return component.getPrice()+price;
    }

    public String getName() {

        return component.getName()+" "+name;
    }

}
