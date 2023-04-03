package Gestion_Banque;

public class GestionBanque {
    public static void main (String[]args) {
        CompteBancaire compteBancaire = new CompteBancaire(741258966,00);
        compteBancaire.deposerArgent(20);

        String log = Journalisation.getInstance().getLog();
        System.out.println(log);

        compteBancaire.retirerArgent(10);

         log = Journalisation.getInstance().getLog();
        System.out.println(log);
    }

}
