package TP_Jeux;

public class Attaquant implements Ijoueur {
    private String name;

    public Attaquant(){}

    public Attaquant(String name){
        this.name=name;
    }

    public void Lancer(){ System.out.println("l'attaquant garde la balle");}

    public void Garder(){System.out.println("l'attaquant lance la balle");}

    @Override
    public String toString() {
        return "Attaquant{" +
                "name='" + name + '\'' +
                '}';
    }
}
