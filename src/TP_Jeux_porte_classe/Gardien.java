package TP_Jeux_porte_classe;

public class Gardien extends Joeur{

    public Gardien(){
        super();
    }

    public void Lancer(){System.out.println("le gardien garde la balle");}
    public void Garder(){System.out.println("le gardien lance la balle");}

    public Gardien(String nomJoeur) {
        super(nomJoeur);
    }

    @Override
    public String toString() {
        return "Gardien{" +
                "nomJoeur='" + nomJoeur + '\'' +
                '}';
    }
}
