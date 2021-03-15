package predavanje5;

/**
 *  Celoštevilski tip int lahko uporabimo za implementacijo množice z 31 elementi takole:  
       element i je v množici x tedaj in le tedaj, ko je v x prižgan i-ti bit

 * Program Mnozica implementira metode za delo z mnozico, v kateri so predstavljeni
 * znaki angleske abecede z enim številom tipa int: i-ti bit tega števila predstavlja
 * prisotnost i-tega znaka (če je bit prižgan, je znak v tabeli, sicer ne). 
 * Primer: množica, v kateri so elementi a, b, e in f, je predstavljena s 
 * številom 0b110011.
 * 
 * @author tomaz
 */
public class Mnozica {
  
  /**
   * 
   * V prazni množici ni nobenega števila, vsi biti so postavljeni na 0.
   */
  static int getPraznaMnožica() {
    return 0;
  }
  
  
  /**
   *  Metoda pretvori znak v števiulo, v katerem je prižgan tisti bit, ki pripada
   * temu številu. Primer: znak 'a' je prvi znak, zato mu pripada prvi bit torej 
   * število 1 (2^0), znak 'd' je četrti znak, zato mu pripada četrti bit torej 
   * število 8 (2^3), znak 'k' je enajsti znak, zato mu pripada enajsti bit torej 
   * število 1024 (2^10), ...  
   */
  static int znakVBit(char z) {
    // 'b'=98, 'a'=97   'b'-'a' = 98 - 97 = 1     
    int idx = z - 'a'; // 0, 1, 2, 3, 


    // int bit = (int) Math.pow(2,idx);
    // z bitnimi operatorji lahko zgornji stavek napišemo tako:
    int bit = 1 << idx;
    
    return bit;
  }
  
  /**
   * Metoda v množici prizge bit, ki pripada znaku z
   */
  static int dodajElement(int mnozica, char z) {
    // tri vrstice naredijo isto kot spodnja ena vrstica; če je
    // koda dovolj razumljiva, raje uporabljamo krajši zapis
    //int bit = znakVBit(z);
    //mnozica = mnozica | bit;
    //return mnozica;
    
    // krajši zapis:
    return mnozica | znakVBit(z);
  }
  
  /**
   * Metoda se uporablja za dodajanje več elementov hkrati. Dva nova koncepta:
   * 
   * a) parameter definiran z "char... z" - gre za tako imenovan VarArgs način
   *    podajanja parametrov. Če je parameter definiran na VarArgs način, lahko pri 
   *    klicu metode na mestu tega parametra podamo poljubno število (0, 1, 2, ...)
   *    parametrov. Tak parameter lahko uporabimo le kot zadnji parameter!
   *    V metodi parameter obravnavamo kot tabelo.
   * 
   * b) metoda dodajElement(int mnozica, char... z) ima ENAKO ime kot metoda 
   *    dodajElement(int mnozica, char z). To je v javi dovoljeno - imamo lahko 
   *    več metod z istim imenom, razlikovati pa se morajo po številu in/ali tipu
   *    parametrov. Temu pravimo "preoblaganje" (overloading) metod.
   *    
   */
  static int dodajElement(int mnozica, char... z) {
    // ker se z obravnava kot tabela, lahko uporabimo atribut length ...
    for(int i=0; i<z.length; i++) {
      // ... na posamezne parametre pa se lahko sklicujemo z indeksom: z[i].
      mnozica = dodajElement(mnozica, z[i]);
    }
    return mnozica;
  }
  
  /**
   * Metoda preveri, ali je prižgan bit, ki pripada znaku z. 
   * Za preverjanje uporabi bitni IN (ta vrne neničelno vrednost,
   * če je prižgan bit, ki pripada znaku). 
   */
  static boolean jeElement(int mnozica, char z) {
    int bit = znakVBit(z);
    return ((mnozica & bit) == bit);
  }
  
  static String toString(int mnozica) {
    String rezultat = "";
    
    for (char c = 'a'; c <= 'z'; c++) {
      if (jeElement(mnozica, c))
        rezultat += (rezultat.isEmpty() ? "" : ",") + c;
    }
    
    return "["+rezultat+"]";
  }
  
  static int presek(int mnozica1, int mnozica2) {
    return mnozica1 & mnozica2;
  }
  
  static int unija(int mnozica1, int mnozica2) {
    return mnozica1 | mnozica2;
  }

  public static void main(String[] args) {
    int mnozica1 = getPraznaMnožica();
    
    mnozica1 = dodajElement(mnozica1);
    System.out.printf("Mnozica1=%s\n", toString(mnozica1));

    int mnozica2 = getPraznaMnožica();
    mnozica2 = dodajElement(mnozica2, 'a', 'f', 'z', 'b');
    System.out.printf("Mnozica2=%s\n", toString(mnozica2));

    int presek = presek(mnozica1, mnozica2);
    int unija = unija(mnozica1, mnozica2);
    System.out.printf("presek(%s, %s)=%s\n", toString(mnozica1), toString(mnozica2), toString(presek));
    System.out.printf("inija (%s, %s)=%s\n", toString(mnozica1), toString(mnozica2), toString(unija));
  }

}
