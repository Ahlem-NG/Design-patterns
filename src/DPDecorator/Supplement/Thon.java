package DPDecorator.Supplement;

import DPDecorator.Component;
import DPDecorator.Decorator;

public class Thon extends Decorator {
    protected static float price=3000;
    public Thon() {

    }
    public Thon(String name, Component component) {
        super(name,component);
    }

    public float getPrice() {

        return component.getPrice()+price;
    }

    public String getName() {

        return component.getName()+" "+name;
    }


}
