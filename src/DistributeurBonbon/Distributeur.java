package DistributeurBonbon;


public class Distributeur {

    private Etat etatEpuise;
    private Etat etatApiece;
    private Etat etatSanspiece;
    private Etat etatVendu;
    private Etat etatActuel=etatEpuise ;
    private int nombreBonbons=0;
    private int count=0;

    public Distributeur(int nombreBonbons) {
       etatEpuise = new EtatEpuise(this);
       etatApiece = new EtatAPiece(this);
       etatSanspiece = new EtatSansPiece(this);
       etatVendu = new EtatVendu(this);

        this.nombreBonbons=nombreBonbons;
        if (nombreBonbons > 0) {
            etatActuel = etatSanspiece;
        }
    }

    public void remplir(int nombreBonbons){
        this.nombreBonbons=nombreBonbons;
        etatActuel=etatSanspiece;
    }

    public void setEtat(Etat newEtat) {
        this.etatActuel = newEtat;
    }


    public void insererPiece(){
        etatActuel.insererPiece();
    }
    public void  ejecterPiece(){
        etatActuel.ejecterPiece();
    }
    public void tournerPoignee(){
        etatActuel.tournerPoignee();
        etatActuel.delivrer();
    }

    void liberer() {


        if (nombreBonbons > 0) {
            System.out.println("Un bonbon va sortir...");
            nombreBonbons = nombreBonbons - 1;
            count++;
        } else {
            etatActuel = new EtatEpuise(this);
        }

        if (count == 5 && nombreBonbons > 0) {
            System.out.println("===> vous etes le 5 eme vous avez un bonbon gratuit.");
            nombreBonbons = nombreBonbons - 1;
            count = 0;
        }
    }



    int getNombreBonbon() {

        return nombreBonbons;
    }

    public Etat getEtat() {
        return etatActuel;
    }



    @Override
    public String toString() {

       if(nombreBonbons>0){
           return "Distributeur \t " +
                   "nombre bonbons :"+ nombreBonbons +"\t"+
                    "la machine attend une piece";
       }

       else
       {
           return "Distributeur \t " +
                   "nombre bonbons :"+ nombreBonbons +"\t"+
                   "la machine est en rupture de stock.";
    }

}


    public static void main (String[]args) {

        int n=11;
        Distributeur distributeur = new Distributeur(n);
        distributeur.remplir(n);


for(int i=1;i<=n;i++) {
    System.out.println(distributeur);
    distributeur.insererPiece();
    distributeur.tournerPoignee();
    distributeur.liberer();

}
    }
}

