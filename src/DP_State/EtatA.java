package DP_State;

public  class EtatA implements Etat {

    @Override
    public void operationEtatB(ClasseAvecEtat a) {
        System.out.println(" etat A vers etat B");
        a.setState(new EtatB());
    }

    @Override
    public void operationEtatA(ClasseAvecEtat a) {
        System.out.println(" je suis a letat A ");
    }

    @Override
    public void operationEtatC(ClasseAvecEtat a) {
        System.out.println(" je suis a letat A ");
    }
}
