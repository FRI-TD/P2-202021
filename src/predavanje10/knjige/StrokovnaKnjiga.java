package predavanje10.knjige;


/**
 * StrokovnaKnjiga (naslednik razreda Knjiga) osnovnih poleg podatkov o knjigi 
 * vsebuje tudi indeks (seznam gesel in številk strani).
 * 
 * @author tomaz
 */
public class StrokovnaKnjiga extends Knjiga {
  String indeks;  // "arrays:55;class:20;for:10
  
  StrokovnaKnjiga(String naslov, String avtor, int letoIzdaje, String indeks) {
    super(naslov, avtor, letoIzdaje);
    
    this.indeks = indeks;
  }
  
  public String getPodrobnosti() {
    return indeks + "\n\n";
  }
}
