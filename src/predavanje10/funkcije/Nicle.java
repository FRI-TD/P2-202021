package predavanje10.funkcije;

/**
 * Demonstracija uporabe abstraktnega razreda (Funkcija) v implementaciji Newtnove
 * metode. Pri uporabi metode poisciNiclo() moramo podati konkretno funkcijo
 * (ki seveda ne smebiti abstraktna).
 * 
 * @author tomaz
 */
public class Nicle {

  /**
   * Računanje ničle funkcije po Newtnovi iteracijski metodi.
   * @param f funkcija, katere ničlo računamo
   * @param x0 začetni približek
   * @param n število iteracij
   * @return približek za ničlo funkcije
   */
  static double poisciNiclo(Funkcija f, double x0, int n) {  
    for (int i = 0; i < n; i++) {
      x0 = x0 - f.vrednost(x0) / f.odvod(x0);
    }
    return x0;
  }
  
  public static void main(String[] args) {
    // Funkcijo lahko naredim kot primerek razreda, ki je naslednik razreda Funkcija ...
    Funkcija f1 = new Sinus(); 
    double x = poisciNiclo(f1, 3, 3);
    System.out.println(x);
    System.out.println(Math.PI);
    
    // ... ali s pomočjo anonimnega notranjega razreda
    Funkcija f2 = new Funkcija() {
      @Override
      public double vrednost(double x) {
        return Math.cos(x);
      }

      @Override
      public double odvod(double x) {
        return -Math.sin(x);
      }      
    };
  }
  
}
