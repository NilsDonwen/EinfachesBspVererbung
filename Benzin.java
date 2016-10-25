package vererbungauto;

/**
 *
 * @author Nils
 */
public class Benzin extends VererbungAUTO {

    
    double verbrauch = 7.3;       // wird noch erweitert um Varibale 'verbrauch' ... Rest bleibt gleich
    
    public Benzin(String dieArt, String dieFarbe) {     // wird auch hier übernommen
        super(dieArt, dieFarbe);
    }

    void benzin(){
        System.out.println("Ich verbrauche: " + verbrauch + " Liter!");
    }
}
