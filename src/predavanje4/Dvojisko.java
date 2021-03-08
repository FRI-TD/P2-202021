package predavanje4;

/**
 * Pomoč pri domači nalogi.
 * 
 * @author tomaz
 */
public class Dvojisko {
  
  // če želite (zelo priporočam!!!), lahko sami napišete 
  // metodo za pretvorbo v desetiški sistem 
  // Sicer lahko namesto tega uporabite Integer.parseInt(stevilo, 2);
  static int vDesetisko(String stevilo) {
    int d=0;
    //...
    return d;
  }
  
  public static void main(String[] args) {
    // ko boste imeli v spremenljivki 8 znakov 
    // (ki predstavljajo eno črko) ...
    String a="01000001";
    
    // ... uporabite pretvorbo v desetiško število takole:
    // int x = vDesetisko(a);
    int x = Integer.parseInt(a, 2);
    
    System.out.printf("Stevilo: %d\n", x);           // 65
    
    System.out.printf("Crka: '%c'\n", x);            // 'A'
    
    String rezultat="";
    rezultat += (char) x;    
    System.out.printf("Niz:  \"%s\"\n", rezultat);   // "A"
  }

}
