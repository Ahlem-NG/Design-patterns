package DP_Strategie_NV.DP_Strategie;

public class EmessionGaz implements IEmmessionSonore{
    @Override
    public void rouler(String ch, float n) {
        System.out.println("je suis un "+ ch +" emmession "+n );
    }

}
