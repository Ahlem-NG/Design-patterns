package Template_Method;
import java.util.Scanner;

public class MainHouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Voulez vous construire une maison O/N:");
            String str1 = sc.nextLine();

            if (str1.equals("O")) {
                System.out.println("De quel type : classique c ou moderne m ");
                String str2 = sc.nextLine();

                if(str2.equals("C")) {

                   ClassicHouse classichouse = new ClassicHouse();
                    classichouse.buildHouse();
                }
                if (str2.equals("M")){

                    ModernHouse modernhouse = new ModernHouse();
                    modernhouse.buildHouse();
                }


            }
            else if (str1.equals("N"))
                break;
            else
                System.out.println("votre choix est incorrecte ");
        }






















    }
    }

