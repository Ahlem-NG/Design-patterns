package DP_Strategie_NV.DP_Strategie;


public  class Bus extends Vehicules {
public Bus(float cyl,IEmmessionSonore IES){
    super(cyl,IES);
}
 @Override
    public void executer() {
    IES.rouler("Bus", cyl);
    }

    public Bus(){}
}
