package TP_Jeux;

public class Gardeur implements Ijoueur {
    private String name;

    public Gardeur(){}

    public Gardeur(String name){
        this.name=name;
    }
    public void Lancer(){System.out.println("le gardien garde la balle");}
    public void Garder(){System.out.println("le gardien lance la balle");}

    @Override
    public String toString() {
        return "Gardeur{" +
                "name='" + name + '\'' +
                '}';
    }
}
