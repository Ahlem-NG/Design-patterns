package DP_Strategie;

public  class Voiture extends Vehicules {


    @Override
    public void executer(TypeEngine te, float cyl) {
        switch(te){
            case essence:
                EmessionEssence es = new EmessionEssence();
                es.rouler("voiture essence",cyl);
                break;
            case gaz:
                EmessionGaz eg = new EmessionGaz();
                eg.rouler("voiture gaz", cyl);
                break;
            case electrique:
                EmessionElectrique ee = new EmessionElectrique();
                ee.rouler("voiture electrique", cyl);
                break;
            default:
                EmessionGazoil egl = new EmessionGazoil();
                egl.rouler("voiture gazoil", cyl);

        }
    }


}
