package DPDecorator;

import DPDecorator.Supplement.Frommage;
import DPDecorator.Supplement.Legumes;
import DPDecorator.Supplement.Thon;
import DPDecorator.Type_De_Base.PizzaBlanche;
import DPDecorator.Type_De_Base.PizzaTomate;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        /*choix
        - frommage
        -thon
        -legumes
         */
        /*
        initiallement
        -pizza tomate : prix 3000
        -pizza creme (blanche) : prix 3000
         */

        PizzaTomate pizzatomate = new PizzaTomate("Pizza Tomate");
        PizzaBlanche pizzablanche = new PizzaBlanche("Pizza Blanche");

        Frommage frommage = new Frommage("Frommage", pizzatomate);
        Thon thon = new Thon("Thon", frommage);
        Legumes legumes = new Legumes("Legumes", thon);

        System.out.println("Nom pizza "+legumes.getName());
        System.out.println("Cout pizza "+legumes.getPrice());

        frommage = new Frommage("Frommage", pizzablanche);
        thon = new Thon("Thon", frommage);
        System.out.println("Nom pizza "+thon.getName());
        System.out.println("Cout pizza "+thon.getPrice());

    }
}
