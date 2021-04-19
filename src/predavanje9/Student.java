package predavanje9;

/**
 * Razred, ki hrani podatke o enem študentu: ime, id, ocene in status.
 * Razred vsebuje tudi metode povprecje() (ki izracuna povprecje vpisanih ocen),
 * toString() (ki vrne vsebino objekta v znakovni obliki), dodajOceno() (za dodajanje
 * ocen v tabelo) ter osveziStatus() (ki pravilno nastavi status studenta)
 * 
 * Vsi atributi v razredu so privatni, zato so dodani tudi pripadajoči getterji in setterji.
 * 
 * Na atribute v razredu se sklicujemo preko rezervirane besede this.
 * 
 * Klic drugega konstruktorja opravimo z uporabo konstruktorja this().
 * 
 * @author tomaz
 */
public class Student {
  private String ime;
  private int    id;
  
  private boolean padelLetnik;
  
  private String status;
  
  private int[] ocene;
  private int   stOcen; // koliko ocen je shranjenih v  tabeli
  
  
  Student(String ime, int id) {
    this.ime = ime;
    this.id  = id;
    
    status = "?";
    ocene  = new int[10];
    stOcen = 0;
  }
  
  Student(String ime) {
    this(ime, 63000000);
  }

  public String getIme() {
    return ime;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isPadelLetnik() {
    return padelLetnik;
  }

  public void setPadelLetnik(boolean padelLetnik) {
    this.padelLetnik = padelLetnik;
  }
    
  void dodajOceno(int ocena) {
    this.ocene[this.stOcen++] = ocena;
    osveziStatus();
  }
  
  void osveziStatus() {
    if (povprecnaOcena() > 9)
      status = "Odličen";
    else
      status = "Dober";
  }
  
  double povprecnaOcena() {
    double vsota = 0;
    for (int i = 0; i < stOcen; i++) {
      vsota += ocene[i];
    }
    return stOcen == 0 ? 0 : vsota / stOcen;
  }
  
  public String toString() {
    return String.format("Ime: %s, id: %d, status: %s, povprecna ocena: %.2f", ime, id, status, povprecnaOcena());
  }

}
