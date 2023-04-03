package TP_Jeux_porte_classe;

public class Joeur {
    protected String nomJoeur;
    public Joeur(){}
    public Joeur(String nomJoeur){this.nomJoeur=nomJoeur;}
    public void Lancer(){ }
    public void Garder(){ }

    @Override
    public String toString() {
        return "Joeur{" +
                "nomJoeur='" + nomJoeur + '\'' +
                '}';
    }
}
