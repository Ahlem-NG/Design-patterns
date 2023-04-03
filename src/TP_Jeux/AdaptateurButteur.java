
package TP_Jeux;

public class AdaptateurButteur implements Ijoueur {
    Butteur O;
    public AdaptateurButteur(Butteur _O){
        O=_O;
    }
    public void Lancer(){O.start();}
    public void Garder(){O.keep();}

    @Override
    public String toString() {
        return "Butteur{" +
                "nomJoeur='" + O.getButteurnom() + '\'' +
                '}';
    }
}
