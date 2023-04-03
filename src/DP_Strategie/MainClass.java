package DP_Strategie;


import Simulateur.*;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Quel type de vehicule voulez vous creer ?");
            System.out.println("cliquer sur n'importe quelle touche pour quitter ...");
            System.out.println("===> Voiture V , Camion C , Bus B");

            String choix = sc.nextLine();


            if (choix.equals("V")) {
                System.out.println("De quel type : essence , gazoil  , gaz , elec");
                String choix2 = sc.nextLine();

                if (choix2.equals("essence")) {

                    Voiture vt = new Voiture();
                    TypeEngine T1=TypeEngine.essence;
                    vt.executer(T1,2);
                }
                if (choix2.equals("gazoil")) {

                    Voiture vt = new Voiture();
                    TypeEngine T1=TypeEngine.gazoil;
                    vt.executer(T1,2);
                }
                if (choix2.equals("gaz")) {

                    Voiture vt = new Voiture();
                    TypeEngine T1=TypeEngine.gaz;
                    vt.executer(T1,2);
                }
                if (choix2.equals("elec")) {

                    Voiture vt = new Voiture();
                    TypeEngine T1=TypeEngine.electrique;
                    vt.executer(T1,28);
                }
            } else if (choix.equals("C")) {
                System.out.println("De quel type : essence , gazoil  , gaz , elec  ");
                String choix2 = sc.nextLine();

                if (choix2.equals("essence")) {
                    Camion c = new Camion();
                    TypeEngine T1=TypeEngine.essence;
                    c.executer(T1,29);
                }
                if (choix2.equals("gazoil")) {
                    Camion c = new Camion();
                    TypeEngine T1=TypeEngine.gazoil;
                    c.executer(T1,24);
                }
                if (choix2.equals("gaz")) {
                    Camion c = new Camion();
                    TypeEngine T1=TypeEngine.gaz;
                    c.executer(T1,20);
                }
                if (choix2.equals("elec")) {
                    Camion c = new Camion();
                    TypeEngine T1=TypeEngine.electrique;
                    c.executer(T1,2111);
                }

            } else if (choix.equals("B")) {
                System.out.println("De quel type : essence , gazoil  , gaz , elec");
                String choix2 = sc.nextLine();

                if (choix2.equals("essence")) {
                    Bus b = new Bus();
                    TypeEngine T1=TypeEngine.essence;
                    b.executer(T1,2117771);
                }
                if (choix2.equals("gazoil")) {
                    Bus b = new Bus();
                    TypeEngine T1=TypeEngine.gazoil;
                    b.executer(T1,21);
                }
                if (choix2.equals("gaz")) {
                    Bus b = new Bus();
                    TypeEngine T1=TypeEngine.gaz;
                    b.executer(T1,210);
                }
                if (choix2.equals("elec")) {
                    Bus b = new Bus();
                    TypeEngine T1=TypeEngine.electrique;
                    b.executer(T1,2117771);
                }

            } else {
                System.out.println("votre choix est incorrecte ");
                break;
            }

        }

    }
}
