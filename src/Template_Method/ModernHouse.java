package Template_Method;

public class ModernHouse extends House {

    public ModernHouse() {
        super();
    }

    @Override
    public void decorateHouse() {
        System.out.println(" decorateHouse ModernHouse ");
    }

    @Override
    public void paintHouse() {
        System.out.println(" paintHouse ModernHouse ");
    }

    @Override
    public void constructDoors() {
        System.out.println(" constructDoors ModernHouse ");
    }

    @Override
    public void constructWindows() {
        System.out.println(" constructWindows ModernHouse ");
    }

    @Override
    public void constructWalls() {
        System.out.println(" constructWalls ModernHouse ");
    }
}
