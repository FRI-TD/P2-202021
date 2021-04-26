package predavanje10.knjige;

/**
 * Leposlovje (naslednik razreda Knjiga) osnovnih poleg podatkov o knjigi 
 * vsebuje tudi seznam mnenj bralcev.
 * @author tomaz
 */
public class Leposlovje extends Knjiga {
  static final int MAX_MNENJ = 100;
  
  String[] mnenjaBralcev;
  int stMnenj;
  
  Leposlovje(String naslov, String avtor, int letoIzdaje) { 
    // klic konstuktorja od nadrazreda: Knjiga(....)
    super(naslov, avtor, letoIzdaje);
    
    mnenjaBralcev = new String[MAX_MNENJ];
    stMnenj = 0;
  }
  
  public void dodajMnenje(String mnenje) {
    mnenjaBralcev[stMnenj++] = mnenje;
  }  
  
  public String getPodrobnosti() {
    StringBuilder mnenja = new StringBuilder();
    for (int i = 0; i < stMnenj; i++) {
      mnenja.append("Mnenje: " + mnenjaBralcev[i] + "\n");
    }
    mnenja.append("\n");
    
    return mnenja.toString();
  }

}
