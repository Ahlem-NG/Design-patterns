package Fabric;

import DP_Strategie.Bus;
import DP_Strategie.Camion;
import DP_Strategie.TypeEngine;
import DP_Strategie.Voiture;

import java.util.Scanner;

public class Pizzaria {

    public Pizza fabriquerPizza() {
        FabriquePizza fab=null;
         Pizza pizza=null;

          Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("voulez vous commander une pizza o/n");
            String choix = sc.nextLine();


            if (choix.equals("o")) {
                System.out.println("De quelle type : 4 frommage (1) ou fruit de mer (2)");
                String choix2 = sc.nextLine();

                if (choix2.equals("1")) {
                   pizza= (Pizza4Frommage)fab.creerObjet();
                }

             else if (choix.equals("2")) {
                   pizza= (PizzaFruitdemere)fab.creerObjet();
            }

        }
            return pizza;
    }
    }

}


