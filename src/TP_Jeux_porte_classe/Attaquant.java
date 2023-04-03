package TP_Jeux_porte_classe;

public class Attaquant extends Joeur{
    public Attaquant(){
        super();
    }

    public Attaquant(String nomJoeur) {
        super(nomJoeur);
    }

    public void Lancer(){System.out.println("l' attaquant garde la balle");}
    public void Garder(){System.out.println("l' attaquant lance la balle");}

    @Override
    public String toString() {
        return "Attaquant{" +
                "nomJoeur='" + nomJoeur + '\'' +
                '}';
    }
}
