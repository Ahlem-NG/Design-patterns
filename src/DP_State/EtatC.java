package DP_State;

public  class EtatC implements Etat {
    @Override
    public void operationEtatA(ClasseAvecEtat a) {
        System.out.println(" etat C vers etat A");
        a.setState(new EtatA());
    }

    @Override
    public void operationEtatB(ClasseAvecEtat a) {
        System.out.println(" etat C vers etat B");
        a.setState(new EtatB());
    }

    @Override
    public void operationEtatC(ClasseAvecEtat a) {
        System.out.println(" je suis a letat C ");
    }
}
