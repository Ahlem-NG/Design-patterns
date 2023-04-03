package DPComposite;
import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
    protected String name;

    public Menu(String name) {
        this.name = name;
    }

    public Menu() {
    }

    public abstract void operation();
    public  void add(Menu m){throw new UnsupportedOperationException();}
    public  void remove(Menu m){throw new UnsupportedOperationException();}
    public ArrayList<Menu> getchildren(){throw new UnsupportedOperationException();}
}
