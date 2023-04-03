package DP_Strategie_NV.DP_Strategie;




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
               
                Voiture vt= new Voiture();
                if (choix2.equals("essence")) 

                     vt = new Voiture(2,new EmessionEssence());
                  
              
                else if (choix2.equals("gazoil")) 

                   vt = new Voiture(22,new EmessionGazoil());
                   
                
                else if (choix2.equals("gaz")) 

                 vt = new Voiture(72,new EmessionGaz());
                
                else if (choix2.equals("elec")) 
                 vt = new Voiture(72,new EmessionElectrique());
                
                  vt.executer();
            } 
            
            
            
            else if (choix.equals("C")) {
                System.out.println("De quel type : essence , gazoil  , gaz , elec  ");
                String choix2 = sc.nextLine();

              Camion vt= new Camion();
                if (choix2.equals("essence")) 

                     vt = new Camion(2,new EmessionEssence());
                  
              
                else if (choix2.equals("gazoil")) 

                   vt = new Camion(22,new EmessionGazoil());
                   
                
                else if (choix2.equals("gaz")) 

                 vt = new Camion(72,new EmessionGaz());
                
                else if (choix2.equals("elec")) 
                 vt = new Camion(72,new EmessionElectrique());
                
                  vt.executer();
            } 

             else if (choix.equals("B")) {
                System.out.println("De quel type : essence , gazoil  , gaz , elec");
                String choix2 = sc.nextLine();

               Bus vt= new Bus();
                if (choix2.equals("essence")) 

                     vt = new Bus(2,new EmessionEssence());
                  
              
                else if (choix2.equals("gazoil")) 

                   vt = new Bus(22,new EmessionGazoil());
                   
                
                else if (choix2.equals("gaz")) 

                 vt = new Bus(72,new EmessionGaz());
                
                else if (choix2.equals("elec")) 
                 vt = new Bus(72,new EmessionElectrique());
                
                  vt.executer();

            } else {
                System.out.println("votre choix est incorrecte ");
                break;
            }

        }

    }
}
