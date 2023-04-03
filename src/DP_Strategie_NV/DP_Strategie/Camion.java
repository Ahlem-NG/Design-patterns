package DP_Strategie_NV.DP_Strategie;


public  class Camion extends Vehicules{
public Camion(float cyl,IEmmessionSonore IES){
    super(cyl,IES);
}
 @Override
    public void executer() {
    IES.rouler("camion", cyl);
    }
    
    public Camion(){
}
}
