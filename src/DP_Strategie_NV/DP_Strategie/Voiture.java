package DP_Strategie_NV.DP_Strategie;

public  class Voiture extends Vehicules {

public Voiture(float cyl,IEmmessionSonore IES){
    super(cyl,IES);
}
public Voiture(){}

    @Override
    public void executer() { IES.rouler("Voiture", cyl);
    }


}
