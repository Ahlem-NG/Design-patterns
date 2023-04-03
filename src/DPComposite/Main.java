package DPComposite;

import DP_Strategie_NV.DP_Strategie.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void affichageMenu(ArrayList<Menu> menuliste , String signification) {
        System.out.println ("*** "+signification+" ***");
        int i = 0;
        for(Menu elem: menuliste)
        { i++;
            System.out.println (i + " "+ elem.toString());
        }
    }

    public static ArrayList<Menu> getAllCompositeChildren(Menu com){
        ArrayList<Menu> res;
        res=com.getchildren();
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Menu> menufood = new ArrayList<Menu>();
        ArrayList<Menu> menuplat = new ArrayList<Menu>();
        Menu composite;
        ArrayList<Menu> listecomposite;
        String signification="";

        while (true) {
            System.out.println("Voulez vous ajouter un composite O/N? \t");
            String choix = sc.nextLine();
            if (choix.equals("O")) {

                System.out.println("Entrer le nom du composite");
                String namecom = sc.nextLine();
                composite = new Menu_Food(namecom);
                menufood.add(composite);


                while (true) {
                    System.out.println("voulez vous associer a " + composite.toString() + " des plats ?");
                    String rep = sc.nextLine();
                    if (rep.equals("O")) {
                        System.out.println("Entrer le nom du plat");
                        String nameplat = sc.nextLine();

                        System.out.println("Entrer le prix du plats " + nameplat);
                        String prix = sc.nextLine();
                        Menu leaf = new Plats(nameplat, Integer.parseInt(prix));
                        menuplat.add(leaf);
                        composite.add(leaf);


                    }
                    else break;
                }
            }
            else if (choix.equals("N")) break;
             else {
                System.out.println("votre choix est incorrecte ");
                break;
            }
        }


        affichageMenu(menufood,"Liste des menus");
        //affichageMenu(menuplat,"Liste des plats");




            for(Menu elem: menufood){
                signification=elem.toString();
                listecomposite=getAllCompositeChildren(elem);
                affichageMenu(listecomposite,signification);
            }


    }
}
