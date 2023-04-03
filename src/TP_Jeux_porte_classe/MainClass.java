package TP_Jeux_porte_classe;

import TP_Jeux.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    ArrayList<Joeur> Joeurcollection = new ArrayList<Joeur>();
    Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("Voulez vous créer un joeur O/N:");
        String str1 = sc.nextLine();

        if (str1.equals("O")) {
            System.out.println("De quel type : A,D,G,B ");
            String str2 = sc.nextLine();

            if (str2.equals("A")) {
                System.out.println("Tapez le nom du l'attaquant :");
                String attnom = sc.nextLine();
                Joeurcollection.add(new Attaquant(attnom));
            }
            if (str2.equals("D")) {
                System.out.println("Tapez le nom du defenceur :");
                String defnom = sc.nextLine();

                Joeurcollection.add(new Defenceur(defnom));
            }
            if (str2.equals("G")) {
                System.out.println("Tapez le nom du gardien :");
                String gardnom = sc.nextLine();

                Joeurcollection.add(new Gardien(gardnom));
            }
            if (str2.equals("B")) {
                System.out.println("Tapez le nom du butteur :");
                String butnom = sc.nextLine();
                Joeurcollection.add(new Adaptateur(new Butteur(butnom)));
            }
        }
        else if (str1.equals("N")) break;
        else
            System.out.println("votre choix est incorrecte ");
    }


        System.out.println("----- Liste des joeurs -----");
        for(int i = 0; i<Joeurcollection.size();i++) {
        System.out.print(i + ") ");
        System.out.println(Joeurcollection.get(i).toString());
            Joeurcollection.get(i).Lancer();
            Joeurcollection.get(i).Garder();
            System.out.println("\n");
    }}
}
