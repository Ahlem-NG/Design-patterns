package DPDecorator.Supplement;

import DPDecorator.Component;
import DPDecorator.Decorator;

public class Frommage extends Decorator {
    protected static float price=2000;
    public Frommage() {

    }
    public Frommage(String name, Component component) {
        super(name,component);
    }

    public float getPrice() {

        return component.getPrice()+price;
    }

    public String getName() {

        return component.getName()+" "+name;
    }

}
