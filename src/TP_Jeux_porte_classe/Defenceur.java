package TP_Jeux_porte_classe;

public class Defenceur extends Joeur {
    public Defenceur(){
        super();
    }

    public void Lancer(){System.out.println("le defenceur garde la balle");}
    public void Garder(){System.out.println("le defenceur lance la balle");}

    public Defenceur(String nomJoeur) {
        super(nomJoeur);
    }

    @Override
    public String toString() {
        return "Defenceur{" +
                "nomJoeur='" + nomJoeur + '\'' +
                '}';
    }
}
