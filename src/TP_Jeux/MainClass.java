package TP_Jeux;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

       /* ArrayList<Attaquant> Attaquantcollection = new ArrayList<Attaquant>();
        ArrayList<Gardeur> Gardeurcollection = new ArrayList<Gardeur>();
        ArrayList<Defenceur> Defenceurcollection = new ArrayList<Defenceur>();
        ArrayList<Butteur> Butteurcollection = new ArrayList<Butteur>();*/
       
        ArrayList<Ijoueur> Joueurcollection = new ArrayList<Ijoueur>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Voulez vous créer un joeur O/N:");
            String str1 = sc.nextLine();

            if (str1.equals("O")) {
                System.out.println("De quel type : A,D,G,B ");
                String str2 = sc.nextLine();

                    if(str2.equals("A")) {
                    System.out.println("Tapez le nom du l'attaquant :");
                    String attnom = sc.nextLine();
                    Joueurcollection.add( new Attaquant(attnom));
                }
                     if (str2.equals("D")){
                    System.out.println("Tapez le nom du defenceur :");
                    String defnom = sc.nextLine();
      
                    Joueurcollection.add( new Defenceur(defnom));
                }
                     if (str2.equals("G")) {
                    System.out.println("Tapez le nom du gardien :");
                    String gardnom = sc.nextLine();
                   
                     Joueurcollection.add( new Gardeur(gardnom));
                }
                      if (str2.equals("B")) {
                          System.out.println("Tapez le nom du butteur :");
                          String butnom = sc.nextLine();
                          Joueurcollection.add(new AdaptateurButteur(new Butteur(butnom)));
                }
            }
            else if (str1.equals("N"))
                break;
            else
                System.out.println("votre choix est incorrecte ");
        }

       /* System.out.println("----- Liste des attaquants -----");
        for( int i = 0 ; i < Attaquantcollection.size(); i++){
            System.out.print(i + " ");
            System.out.println(Attaquantcollection.get(i).toString());
            Attaquantcollection.get(i).Lancer();
            Attaquantcollection.get(i).Garder();
        }

        System.out.println("----- Liste des gardiens -----");
        for( int i = 0 ; i < Gardeurcollection.size(); i++){
            System.out.print(i + " ");
            System.out.println(Gardeurcollection.get(i).toString());
            Gardeurcollection.get(i).Lancer();
            Gardeurcollection.get(i).Garder();}

        System.out.println("----- Liste des defenceurs -----");
        for( int i = 0 ; i < Defenceurcollection.size(); i++){
            System.out.print(i + " ");
            System.out.println(Defenceurcollection.get(i).toString());
            Defenceurcollection.get(i).Lancer();
            Defenceurcollection.get(i).Garder();}
        
          System.out.println("----- Liste des butteurs -----");
        for( int i = 0 ; i < Butteurcollection.size(); i++){
            System.out.print(i + " ");
            System.out.println(Butteurcollection.get(i).toString());
            Butteurcollection.get(i).Lancer();
            Butteurcollection.get(i).Garder();}*/
       
        System.out.println("----- Liste des joeurs -----");
        for( int i = 0 ; i < Joueurcollection.size(); i++) {
            System.out.print(i + ") ");
            System.out.println(Joueurcollection.get(i).toString());
            Joueurcollection.get(i).Lancer();
            Joueurcollection.get(i).Garder();
            System.out.println("\n");
        }
    }

}
