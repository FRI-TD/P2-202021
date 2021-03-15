package predavanje5;

/**
 * Pretvorba iz desetiškega števila (npr. 42) v dvojiški 
 * niz (npr. "101010") in obratno. 
 * @author tomaz
 */
public class Dvojisko {
  
  /**
   * Metoda prejme desetisko stevilo in ustvari dvojiški niz. 
   * Metoda vrne enak rezultat kot klic metode Integer.toString(x,2);
   */
  static String vDvojisko(int x) {
    // v primeru x==0, vrnemo le "0"; brez tega pogoja metoda ne dela
    // pravlino, saj ne vrača ničelna začetku niza; vhod x==0 je izjema 
    // in jo je treba obravnavati posebej.
    if (x==0) return "0"; 
    
    // v spr. rezultat bomo dodajali "bit po bitu"
    String rezultat = "";        
    
    // v spodnji zanki bomo gledali le zadnji bit števila x; če bo ta prižgan, 
    // bomo rezultatu dodali "1", sicer "0"; nato bomo bite števila x zamaknili
    // v desno (tako se bo prvi bit "izgubil", drugi bo postal prvi, tretji 
    // drugi, ...). Postopek bomo ponavljali, dokler ne bo x postal 0 (to je, 
    // dokler se ne bodo vsi njegovi biti zaradi zamika v desno "izgibili"). 
    // 
    while (x > 0) {
     // daljši zapis z enakim pomenom kot spodnja vrstica
     // if ((x & 1)==1) {
     //   rezultat = "1" + rezultat;
     // } else {
     //   rezultat = "0" + rezultat;
     // }

      // (x & 1) == 1 ima vrednost 1 le v primeru, če je prižgan spodnji bit
      rezultat = ((x & 1)==1 ? "1" : "0") + rezultat;      
      
      x = x>>1;
    } 
    
    return rezultat;
  }
  
  /**
   * Metoda pretvori dvojiški niz v desetiško število. 
   * Metoda vrne isti rezultat kot Integer.parseInt(x, 2);
   */
  static int vDesetisko(String x) {    
    int rezultat=0;
    
    // "101010" -> 42
    
    // Začnemo od desne in gremo proti levi; če je trenutni bit prižgan, v 
    // rezultat prištejemo njegovo vrednost. "vrednost" bita je na začetku 1,
    // nato se podvoji (*2) z vsakim prehodom na nov bit.
    int vrd = 1;
    for (int i = x.length()-1; i >= 0; i--) {
      rezultat += x.charAt(i)=='1' ? vrd : 0;
      vrd = vrd << 1; // isto kot vrd = 2*vrd;
    }
            
    return rezultat;
  }

  
  public static void main(String[] args) {    
    
    // int x = 0xFF; // FF(16) = 255(10)
    
    int x = 0b111000111; // dvojiški zapis števila
    
    byte b =  (byte) 0b1111101000101010;
    System.out.println("b="+b);
    
    String dvojisko = vDvojisko(x);
    System.out.println(dvojisko);
    
    int nx = vDesetisko(dvojisko);
    System.out.println(nx);
  }
}
