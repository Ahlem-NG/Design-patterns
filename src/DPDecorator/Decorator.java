package DPDecorator;

public abstract class Decorator implements Component{
    protected String name;

    public Component component;

    public Decorator() {
    }

    public Decorator(String name, Component component) {
        this.name = name;
        this.component = component;
    }

}


