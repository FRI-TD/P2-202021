package predavanje12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author tomaz
 */
public class Kopiraj {
  
  // Metoda prekopira eno datoteko in sicer tako, da bere iz zapisuje po en bajt
  // To je sicer pravilen postopek, a je za daljše datoteke zelo zamuden (za 
  // kopiranje datoteke dolžine 1MB ta postopek traja približno 6 sekund). 
  static void kopirajBajtPoBajtu() {
    File f1 = new File("/Users/tomaz/Desktop/slon/slon.jpeg");
    File f2 = new File("/Users/tomaz/Desktop/slon/slon2.jpeg");
    
    try {
      FileInputStream  fis = new FileInputStream(f1);
      FileOutputStream fos = new FileOutputStream(f2);
      
      while(fis.available() > 0) {
        int z = fis.read();
        fos.write(z);
      } 
      
      fis.close();
      fos.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }    
  }
  
  // Boljši postopek: branje in pisanje datoteke blok-po-bloku;
  // Pri datoteki velikosti 1MB ta postopek traja nekaj mili sekund.
  static void kopirajPoBlokih() {
    File f1 = new File("/Users/tomaz/Desktop/slon/slon.jpeg");
    File f2 = new File("/Users/tomaz/Desktop/slon/slon3.jpeg");
    
    try {
      FileInputStream  fis = new FileInputStream(f1);
      FileOutputStream fos = new FileOutputStream(f2);
      
      byte[] b = new byte[4096];
      while(fis.available() > 0) {
        
        // prebere blok podatkov v tabelo b in vrne, koliko bajtov je prebral
        int prebrano = fis.read(b);
        
        // zapišem vse prebrane podatke
        fos.write(b, 0, prebrano);
      } 
      
      fis.close();
      fos.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }    
  }
  
  public static void main(String[] args) {
     // kopirajBajtPoBajtu(); // 6 sekund
     kopirajPoBlokih();
  }

}
