package Gestion_Banque;

public class Banque {
    private static Banque banqueInstance = new Banque();

    private Banque() {
        super();
    }

    public static Banque getInstance() {
        return banqueInstance;
    }
}
