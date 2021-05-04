package predavanje11.funkcije;

/**
 * Podobno kot pri "predavanje10.funkcije.Funkcija" - edina razlika je v tem, da je tu 
 * Funkcija vmesnik, tam pa je bila "abstraktni razred". Koda se razlikuje tudi v razredih, 
 * ki implementirajo Funkcijo - namesto "extends" je treba uporabiti rezervirano besedo
 * "implements" (glej razred Sinus).
 * 
 * @author tomaz
 */
public interface Funkcija {
  public double vrednost(double x);
  public double odvod   (double x);
}
