package DP_State;

public class ClasseAvecEtat {
    private  EtatA etatA=new EtatA();
   /* private  EtatB etatB=new EtatB();
    private  EtatC etatC=new EtatC();*/
    //etat actuel
    private Etat etatActuel ;

    public ClasseAvecEtat() {
        this.etatActuel=new EtatA();
    }

    public void setState(Etat newEtat) {
        this.etatActuel = newEtat;
    }

    public void operationEtatA(){
         etatActuel.operationEtatA(this);
    }
    public void operationEtatB(){
        etatActuel.operationEtatB(this);
    }
    public void operationEtatC(){
        etatActuel.operationEtatC(this);
    }

    public static void main(String[] args) {
        ClasseAvecEtat c =new ClasseAvecEtat();
       // c.setState(new EtatA());
        c.operationEtatA();
        c.operationEtatB();
        c.operationEtatC();

        c.setState(new EtatB());
        c.operationEtatA();
        c.operationEtatB();
        c.operationEtatC();

    }

}
