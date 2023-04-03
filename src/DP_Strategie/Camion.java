package DP_Strategie;


public  class Camion extends Vehicules{

    public void executer(TypeEngine te , float cyl) {
        switch(te){
            case essence:
                EmessionEssence es = new EmessionEssence();
                es.rouler("Camion essence ",cyl);
                break;
            case gaz:
                EmessionGaz eg = new EmessionGaz();
                eg.rouler("Camion gaz", cyl);
                break;
            case electrique:
                EmessionElectrique ee = new EmessionElectrique();
                ee.rouler("Camion electrique", cyl);
                break;
            default:
                EmessionGazoil egl = new EmessionGazoil();
                egl.rouler("Camion gazoil", cyl);

        }
    }
}
