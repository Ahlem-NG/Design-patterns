package Template_Method;

public abstract class House {

    public House() {
    }
    public final void buildHouse(){
        System.out.println("*** buildHouse ***");
        constructBase();
        constructRoots();
        constructWalls();
        constructDoors();
        constructWindows();
        decorateHouse();
        paintHouse();
    }

    public abstract void decorateHouse();
    public abstract void paintHouse();
    public abstract void constructDoors();
    public abstract void constructWindows();
    public abstract void constructWalls();

    public final void constructRoots(){
        System.out.println(" constructRoots ");
    }
    public final void constructBase(){
        System.out.println(" constructBase ");
    }


}
