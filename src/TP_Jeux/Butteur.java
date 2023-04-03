package TP_Jeux;

public class Butteur {
    private String butteurnom;

    public Butteur(String butteurnom) {
        this.butteurnom = butteurnom;
    }

    public void start(){System.out.println("start ...");}
    public void keep(){System.out.println("keep ...");}

    public String getButteurnom() {
        return butteurnom;
    }
}
