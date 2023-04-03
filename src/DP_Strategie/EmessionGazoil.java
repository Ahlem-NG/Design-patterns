package DP_Strategie;

public class EmessionGazoil  implements IEmmessionSonore {
    @Override
    public void rouler(String ch, float n) {
        System.out.println("je suis un "+ ch +" emmession "+n );
    }
}
