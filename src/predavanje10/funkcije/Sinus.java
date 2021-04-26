package predavanje10.funkcije;

/**
 * Implementacija abstraktnega razreda Funkcija
 * @author tomaz
 */
public class Sinus extends Funkcija {
  public double vrednost(double x) {
    return Math.sin(x);
  };
  public double odvod (double x) {
    return Math.cos(x);
  }
}
