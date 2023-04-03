package Gestion_Banque;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation {
    static private Journalisation uniqueinstance=new Journalisation();
    private String log;
    private Journalisation(){}
    public static Journalisation getInstance() {
        return uniqueinstance; }

    public void AjouterLog (String log) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yy HH'h'mm");
        this.log=dateFormat.format(date)+" "+log+"\n";

    }
    public String getLog( ) {
        return log;
    }
}
