package DPComposite;

import java.util.ArrayList;
import java.util.List;

public class Menu_Food extends Menu {

    private ArrayList<Menu> menu=new ArrayList<Menu>();

    public Menu_Food(String name) {
        super(name);
    }

    @Override
    public void add(Menu m) {
        menu.add(m);

    }

    @Override
    public void remove(Menu m) {
        menu.remove(m);
    }

    @Override
    public  ArrayList<Menu> getchildren(){
        return menu;
    }

    public  void operation(){
        System.out.println(super.name);
        for(Menu elem: menu)
        {
            elem.operation();
        }
    }

    @Override
    public String toString() {
        return  name;
    }
}
