package DistributeurBonbon;

public class EtatSansPiece implements Etat {

    private Distributeur d;

    public EtatSansPiece(Distributeur d) {
        this.d = d;
    }

    @Override
    public void insererPiece() {
        System.out.println("Vous avez inséré une pièce");
        d.setEtat(new EtatAPiece(d));
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Vous n'avez pas inséré de pièce");
    }

    @Override
    public void tournerPoignee() {
        System.out.println("Vous avez tourné, mais il n'y a pas de bonbon");
    }

    @Override
    public void delivrer() {
        System.out.println("Il faut payer d'abord");

    }


}
