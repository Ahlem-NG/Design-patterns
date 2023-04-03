package TP_Jeux_porte_classe;

import TP_Jeux.Butteur;

public class Adaptateur extends Joeur{
    Butteur butteur;

    public Adaptateur(Butteur objButteur){
        butteur=objButteur;
    }
    public void Lancer(){butteur.start();}
    public void Garder(){butteur.keep();}

    @Override
    public String toString() {
        return "Butteur{" +
                "nomJoeur='" + butteur.getButteurnom() + '\'' +
                '}';
    }
}
