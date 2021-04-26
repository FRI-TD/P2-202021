package predavanje10.funkcije;

/**
 * Implementacija abstraktnega razreda Funkcija
 * @author tomaz
 */
public class ENaX extends Funkcija {
  
  @Override
  public double vrednost(double x) {
    return Math.pow(Math.E, x);
  }
    
  @Override
  public double odvod(double x) {
    return Math.pow(Math.E, x);
  }    
}
