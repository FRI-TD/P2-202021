package predavanje10.knjige;

/**
 * Osnovni razred - nosilec splošnih podatkov o knjigi (zaporedna številka, naslov, avtor, leto izdaje).
 * @author tomaz
 */
abstract public class Knjiga extends Object {
  static int steviloVsehKnjig = 0;
  
  private String naslov;
  private String avtor;
  private int letoIzdaje;
  
  int zaporednaStevilka;
  
  Knjiga(String naslov, String avtor, int letoIzdaje) {
    steviloVsehKnjig++;
            
    this.naslov     = naslov;
    this.avtor      = avtor;
    this.letoIzdaje = letoIzdaje;
    
    this.zaporednaStevilka = steviloVsehKnjig;
  }

  public String getNaslov() {
    return naslov;
  }

  public void setNaslov(String naslov) {
    this.naslov = naslov;
  }

  public String getAvtor() {
    return avtor;
  }

  public void setAvtor(String avtor) {
    this.avtor = avtor;
  }

  public int getLetoIzdaje() {
    return letoIzdaje;
  }

  public void setLetoIzdaje(int letoIzdaje) {
    this.letoIzdaje = letoIzdaje;
  }    
  
  // tu je pomembno, da vem, da bo vsi nasledniki razreda Knjiga imali to metodo;
  // kaj bo ta metoda vračala, pa ni pomembno (vsaj z vidika razreda Knjiga ne). 
  abstract public String getPodrobnosti();    
  
  
  void izpis() {
    // izpis splišnih lastnosti knjige ...
    System.out.println("Zap.St: " + zaporednaStevilka);
    System.out.println("Avtor:  " + avtor);
    System.out.println("Naslov: " + naslov);
    System.out.println("Leto:   " + letoIzdaje);
    
    // ... poleg splošnih lastnosti izpišem še niz, ki ga vrne (specializirana)
    // metoda getPodrobnosti(); vsak naslednik razreda Knjiga bo to metodo implementiral 
    // na drugačen način in zato bo vračala drugačne rezultate.
    System.out.println(getPodrobnosti());
  }
}
