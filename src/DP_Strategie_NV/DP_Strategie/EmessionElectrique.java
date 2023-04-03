package DP_Strategie_NV.DP_Strategie;

public class EmessionElectrique implements IEmmessionSonore {
    @Override
    public void rouler(String ch, float n) {
        System.out.println("je suis une "+ ch +" emmession :"+n );
    }
}
