package Template_Method;

public class ClassicHouse extends House {
    public ClassicHouse() {
        super();
    }

    @Override
    public void decorateHouse() {
        System.out.println(" decorateHouse ClassicHouse ");
    }

    @Override
    public void paintHouse() {
        System.out.println(" paintHouse ClassicHouse ");
    }

    @Override
    public void constructDoors() {
        System.out.println(" constructDoors ClassicHouse ");

    }

    @Override
    public void constructWindows() {
        System.out.println(" constructWindows ClassicHouse ");

    }

    @Override
    public void constructWalls() {
        System.out.println(" constructWalls ClassicHouse ");

    }
}
