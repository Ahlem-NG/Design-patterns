package DistributeurBonbon;

public class EtatAPiece implements Etat {
    private Distributeur d;

    public EtatAPiece(Distributeur d) {
        this.d = d;
    }

    @Override
    public void insererPiece() {

        System.out.println("Vous ne pouvez pas insérer d'autre pièce");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Pièce retournée");
        d.setEtat(new EtatSansPiece(d));
    }

    @Override
    public void tournerPoignee() {
        System.out.println("Vous avez tourné....");
        d.setEtat(new EtatVendu(d));
    }

    @Override
    public void delivrer() {
        System.out.println("Pas de bonbon délivré");
    }

}
