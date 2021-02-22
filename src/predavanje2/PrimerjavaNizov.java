package predavanje2;

/**
 * Primerjava nizov - metoda equals()
 * @author tomaz
 */
public class PrimerjavaNizov {
  
  public static void main(String [] args) {
    String niz1 = "Pomlad";  // deklaracija + incializacija
    String niz2 = "danes";
    
    // NAPAKA!!!! Nizov nikoli ne smem primerjati na ta nacin
    if (niz2==niz1) { 
      
    }
    
    // PRAVILNO! Za primerjavo nizov uporabim metodo equals()
    if (niz2.equals(niz1)) {
      
    }
  }

}
