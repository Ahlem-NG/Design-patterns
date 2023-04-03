package Gestion_Banque;

public class CompteBancaire {
    private long numero;
    private double solde;

    public CompteBancaire(){

    }
    public CompteBancaire(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }


    public void deposerArgent(double depo){
        solde+=depo;
        Journalisation.getInstance().AjouterLog("depot de "+depo +"compte: "+numero);
    }
    public void retirerArgent(double retrait){
        solde-=retrait;
        Journalisation.getInstance().AjouterLog("retrait de "+retrait +"compte: "+numero);
    }



}
