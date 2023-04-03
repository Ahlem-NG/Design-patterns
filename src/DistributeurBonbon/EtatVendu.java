package DistributeurBonbon;

public class EtatVendu implements Etat {
    private Distributeur d;

    public EtatVendu(Distributeur d) {
        this.d = d;
    }

    @Override
    public void insererPiece() {
        System.out.println("vous avez deja inserez une piece veuillez patienter. ");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("ejection impossible. ");
    }

    @Override
    public void tournerPoignee() {
        System.out.println("Vous avez tourné. ");
    }

    @Override
    public void delivrer() {
        System.out.println("bonbon delivré. ");

        if(d.getNombreBonbon()==0){
            d.setEtat(new EtatEpuise(d));}

        if(d.getNombreBonbon()>0) {
            d.setEtat(new EtatSansPiece(d));
        }
    }
}
