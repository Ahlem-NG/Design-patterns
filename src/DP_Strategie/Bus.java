package DP_Strategie;


public  class Bus extends Vehicules {

    public void executer(TypeEngine te, float cyl) {
        switch(te){
            case essence:
                EmessionEssence es = new EmessionEssence();
                es.rouler("bus essence",cyl);
                break;
            case gaz:
                EmessionGaz eg = new EmessionGaz();
                eg.rouler("bus gaz", cyl);
                break;
            case electrique:
                EmessionElectrique ee = new EmessionElectrique();
                ee.rouler("Bus electrique", cyl);
                break;
            default:
                EmessionGazoil egl = new EmessionGazoil();
                egl.rouler("bus gazoil", cyl);

        }
    }

}
