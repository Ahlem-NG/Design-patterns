package DistributeurBonbon;

public class EtatEpuise implements Etat {
private Distributeur d;

    public EtatEpuise(Distributeur d) {
        this.d = d;
    }

    @Override
    public void insererPiece() {
        System.out.println("vous ne pouvez pas inserer de pièce, plus de bonbon");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("impossible d'éjecter ! vous n'avez pas inserer de piece.");
    }

    @Override
    public void tournerPoignee() {
        System.out.println("vous avez tournez mais pas du bonbon.");
    }

    @Override
    public void delivrer() {
        System.out.println("pas du bonbon délivré.");
    }
}
