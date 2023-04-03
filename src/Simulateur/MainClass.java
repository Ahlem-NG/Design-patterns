package Simulateur;

import Jeux.Attaquant;
import Jeux.Defenceur;
import Jeux.Gardeur;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    while (true) {
    System.out.println("Quel type de vehicule voulez vous creer ?");
    System.out.println("cliquer sur n'importe quelle touche pour quitter ...");
    System.out.println("===> Voiture V , Camion C , Bus B, moteur M ");

    String choix = sc.nextLine();


    if (choix.equals("V")) {
        System.out.println("De quel type : essence , gazoil  , gaz , elec");
        String choix2 = sc.nextLine();

        if (choix2.equals("essence")) {
            VoitureEssence ve = new VoitureEssence();
            ve.rouler(ve.toString(), 15);
        }
        if (choix2.equals("gazoil")) {
            VoitureGazoil vgl = new VoitureGazoil();
            vgl.rouler(vgl.toString(), 11);
        }
        if (choix2.equals("gaz")) {
            VoitureGaz vg = new VoitureGaz();
            vg.rouler(vg.toString(), 10);
        }
        if (choix2.equals("elec")) {
            VoitureElectrique ve = new VoitureElectrique();
            ve.rouler(ve.toString(), 100000);
        }
    } else if (choix.equals("C")) {
        System.out.println("De quel type : essence , gazoil  , gaz , elec  ");
        String choix2 = sc.nextLine();

        if (choix2.equals("essence")) {
            CamionEssence ce = new CamionEssence();
            ce.rouler(ce.toString(), 15);
        }
        if (choix2.equals("gazoil")) {
            CamionGazoil cg = new CamionGazoil();
            cg.rouler(cg.toString(), 11);
        }
        if (choix2.equals("gaz")) {
            CamionGaz c = new CamionGaz();
            c.rouler(c.toString(), 10);
        }
        if (choix2.equals("elec")) {
            CamionElectrique ce = new CamionElectrique();
            ce.rouler(ce.toString(), 100000);
        }

    } else if (choix.equals("B")) {
        System.out.println("De quel type : essence , gazoil  , gaz , elec");
        String choix2 = sc.nextLine();

        if (choix2.equals("essence")) {
            BusEssence be = new BusEssence();
            be.rouler(be.toString(), 145);
        }
        if (choix2.equals("gazoil")) {
            BusGazoil bg = new BusGazoil();
            bg.rouler(bg.toString(), 11);
        }
        if (choix2.equals("gaz")) {
            BusGaz bgz = new BusGaz();
            bgz.rouler(bgz.toString(), 10);
        }
        if (choix2.equals("elec")) {
            BusElectrique be = new BusElectrique();
            be.rouler(be.toString(), 100000);
        }

    } else if (choix.equals("M")) {
    MoteurEssence me = new MoteurEssence();
    me.rouler(me.toString(),88);
    } else {
        System.out.println("votre choix est incorrecte ");
        break;
    }

}
    }
}

