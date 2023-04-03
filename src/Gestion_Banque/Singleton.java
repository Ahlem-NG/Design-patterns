package Gestion_Banque;

public class Singleton {
    static private Singleton uniqueInstance =new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
            return uniqueInstance; }


    public String toString() {
        return "Singleton";
    }

    public static void main (String[]args){
        Singleton S1=Singleton.getInstance();
        String name =S1.toString();
        System.out.println(name);
        }

}