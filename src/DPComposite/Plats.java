package DPComposite;

public class Plats extends Menu{
    private float prix ;

    public  void operation(){
        System.out.println(" Le prix du "+name +" est : "+ prix +"dt");
    }

    public Plats(String name, float prix) {
        super(name);
        this.prix=prix;
    }


    @Override
    public String toString() {
        return name+" "+prix+" dt";
    }
}
