package vererbungauto;

/**
 *
 * @author Nils
 */
public class ElektroAuto extends VererbungAUTO {      // von VererbungAUTO wird geerbt  

    
    String name;

   // Der Konstruktor von VererbungAUTO MUSS hier ebenfalls aufgerufen werden...
    public ElektroAuto(String dieArt, String dieFarbe , String name) {
        super(dieArt, dieFarbe);        //.. dazu dient super
        this.name = name;
    }
    
    // Erstellen der Methode
    void elektro(){
        System.out.println("Ich bin ein Elektroauto!");     // Ausgabe auf der Konsole
    }
   

    
    
}
