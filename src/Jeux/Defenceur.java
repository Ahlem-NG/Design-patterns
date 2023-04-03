package Jeux;

public class Defenceur {
    private String name;

    public Defenceur(){}

    public Defenceur(String name){
        this.name=name;
    }
    public void Lancer(){System.out.println("le defenseur garde la balle");}
    public void Garder(){System.out.println("le defenseur lance la balle");}

    @Override
    public String toString() {
        return "Defenceur{" +
                "name='" + name + '\'' +
                '}';
    }
}
