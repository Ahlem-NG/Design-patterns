package Jeux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<Attaquant> Attaquantcollection = new ArrayList<Attaquant>();
        ArrayList<Gardeur> Gardeurcollection = new ArrayList<Gardeur>();
        ArrayList<Defenceur> Defenceurcollection = new ArrayList<Defenceur>();

        Scanner sc = new Scanner(System.in);


        int size= Attaquantcollection.size();

        while (true) {
            System.out.println("Voulez vous créer un joeur O/N:");
            String str1 = sc.nextLine();

            if (str1.equals("O")) {
                System.out.println("De quel type : A,D,G ");
                String str2 = sc.nextLine();

                    if(str2.equals("A")) {
                    System.out.println("Tapez le nom du l'attaquant :");
                    String attnom = sc.nextLine();
                    Attaquant a = new Attaquant(attnom);
                    Attaquantcollection.add(a);
                }
                     if (str2.equals("D")){
                    System.out.println("Tapez le nom du defenceur :");
                    String defnom = sc.nextLine();
                    Defenceur d = new Defenceur(defnom);
                    Defenceurcollection.add(d);
                }
                     if (str2.equals("G")) {
                    System.out.println("Tapez le nom du gardien :");
                    String gardnom = sc.nextLine();
                    Gardeur g = new Gardeur(gardnom);
                    Gardeurcollection.add(g);
                }


            }
            else if (str1.equals("N"))
                break;
            else
                System.out.println("votre choix est incorrecte ");
        }

        System.out.println("----- Liste des attaquants -----");
        for( int i = 0 ; i < Attaquantcollection.size(); i++){
            System.out.print(i + " ");
            System.out.println(Attaquantcollection.get(i).toString());}

        System.out.println("----- Liste des gardiens -----");
        for( int i = 0 ; i < Gardeurcollection.size(); i++){
            System.out.print(i + " ");
            System.out.println(Gardeurcollection.get(i).toString());}

        System.out.println("----- Liste des defenceurs -----");
        for( int i = 0 ; i < Defenceurcollection.size(); i++){
            System.out.print(i + " ");
            System.out.println(Defenceurcollection.get(i).toString());}
    }

}
