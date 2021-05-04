package predavanje11;

import java.util.*;

/**
 * Uporaba slovarja  - število dni posameznega meseca. Ključ v slovarju je ime 
 * meseca, vrednost pa število dni tega meseca.
 * 
 * @author tomaz
 */
public class Meseci {
  public static void main(String[] args) {
    TreeMap<String,Integer> meseci = new TreeMap();
        
    
    meseci.put("JAN", 31);  
    meseci.put("FEB", 28);
    meseci.put("MAR", 31);
    meseci.put("APR", 30);
    meseci.put("MAJ", 31);
    
    // do posameznega podatka lahko dostopamo z metodo get(kljuc)
    System.out.println("Maj: " + meseci.get("MAJ"));
    
    // izpis vseh kljucev
    System.out.println("****** KLJUCI *******");
    Set<String> kljuci = meseci.keySet();
    for (String k : kljuci) {
      System.out.println(k);
    }
    
    // izpis vseh vrednosti
    System.out.println("****** Vrednosti ******");
    for (Integer i : meseci.values()) {
      System.out.println(i);
    }
    
    // izpis parov kljuc = vrednost
    System.out.println("****** kljuc = vrednost *****");
    for (String k : meseci.keySet()) {
      System.out.printf("%s = %s\n", k, meseci.get(k));
    }
  }

}
