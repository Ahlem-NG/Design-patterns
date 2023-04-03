package TP_Jeux;

public class Defenceur implements Ijoueur  {
    private String name;

    public Defenceur(){}
    public Defenceur(String name){
        this.name=name;
    }

    public void Lancer(){ System.out.println("le defenceur garde la balle");}
    public void Garder(){System.out.println("Le defenceur lance la balle");}

    @Override
    public String toString() {
        return "Defenceur{" +
                "name='" + name + '\'' +
                '}';
    }
}
