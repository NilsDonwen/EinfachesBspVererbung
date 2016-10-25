
package vererbungauto;

/**
 *
 * @author Nils
 */
public class AutoTest {     // Klasse zum Testen
    
    public static void main (String [] args){
        
        
        // Erstellung von Objekten
        ElektroAuto auto = new ElektroAuto("Elektro" , "weiß" , "Tesla" );     // Übergabeparameter nicht vergessen! 
        Benzin car = new Benzin("Benziner" , "grau");
        
        auto.elektro();
        car.benzin();
        
    }
}
