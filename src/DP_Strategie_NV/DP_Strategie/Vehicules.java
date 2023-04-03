package DP_Strategie_NV.DP_Strategie;

public abstract class Vehicules {
protected float cyl;
protected IEmmessionSonore IES;

public Vehicules(){}
public Vehicules(float cyl,IEmmessionSonore IES){
this.cyl=cyl;
this.IES=IES;}

public abstract void executer();


}