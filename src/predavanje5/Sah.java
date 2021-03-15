package predavanje5;

/**
 * Sah - program, ki dvema igralcema omogoča igranje igre šah:
 *
 *    - program izdela ”igralno ploščo”, na kateri je začetna postavitev 
 *      in ploščo izriše;
 *
 *    - program izmenjaje omogoča izvajanje potez: izmenjaje ”kliče” igralca, 
 *      da vpiše potezo v obliki: izhodišče-cilj (na primer: c2-c4)
 * 
 * 
 * @author tomaz
 */
public class Sah {
  // Unicode kode za znaka za oba (belega in črnega) kralja; ostale 
  // figure imajo kode kralj+1, kralj+2, ...
  // Atributa sta "statična", da ju bom lahko uporabljal v statičnih metodah.
  static int beliKralj = 0x2654;
  static int crniKralj = 0x265A;

  /**
   * Metoda vrne tabelo znakov s kodamo odKje, okKje+1, odKje/2, ..., odKje+koliko-1.
   * Primer: klic vrniTabelo(97, 26) tabelo vseh malih črk angleške abecede, 
   * klic vrniTabelo(beliKralj, 6); pa vse bele šahovske figure.
   */
  static char[] vrniTabelo(int odKje, int koliko) {
    char[] rezultat = new char[koliko];
    
    for (int i = 0; i < koliko; i++) 
      rezultat[i] = (char) (odKje+i);      
    
    return rezultat;
  }
  
  /**
   * Metoda napolni dvodimenzionalno tabelo s šahovskimi figurami.
   */
  static void napolniSahovnico(char[][] sahovnica, char[] beleFigure, char[] crneFigure) {
    
  }
  
  /**
   * Glavna metoda, v kateri je implementirana vsa logika igre:
   *
   *   igraj():
   *     inicializiraj igro
   *     ponavljaj
   *       narisi igralno ploščo
   *       preberi potezo ali ukaz
   *       če je vpisan ukaz
   *         če gre za pravi ukaz
   *           izvrši ukaz
   *         sicer 
   *           javi napako (napačen ukaz)
   *       sicer
   *         preveri pravilnost poteze
   *         če je poteza pravilna
   *           izvrši potezo
   *           zapomni si potezo za zgodovino
   *           zapomni si potezo za razveljavitev
   *           preklopi na naslednjega igralca
   *         sicer
   *           javi napako (nepravilna poteza)
   *   
   */
  static void igraj() {
    // dvodimenzionalna tabela velikost 8x8
    char[][] sahovnica = new char[8][8];
    
    char[] beleFigure = vrniTabelo(beliKralj, 6);
    char[] crneFigure = vrniTabelo(crniKralj, 6);

    napolniSahovnico(sahovnica, beleFigure, crneFigure);
    
  }
  
  public static void main(String[] args) {
    igraj();
  }

}
