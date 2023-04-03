package DP_State;

public  class EtatB implements Etat {

    @Override
    public void operationEtatC(ClasseAvecEtat a) {
        System.out.println(" etat B vers etat C");
        a.setState(new EtatC());
    }


    @Override
    public void operationEtatA(ClasseAvecEtat a) {
        System.out.println(" je suis a letat B ");
    }

    @Override
    public void operationEtatB(ClasseAvecEtat a) {
        System.out.println(" je suis a letat B ");
    }
}
