package predavanje12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import predavanje11.Drzava;

/**
 *
 * @author tomaz
 */
public class UrejanjeDrzav {
  public static void main(String[] args) {
    HashMap<String, Drzava> drzave = predavanje11.OI.preberiDrzave("viri/drzave.txt");
    
    // izpis elementov množice keySet()
    System.out.println("Elementi množice keySet(): ");
    for (String kljuc : drzave.keySet()) {
      System.out.print(kljuc + "  ");
    }
    System.out.println("\n");
    
    // Vse ključe slovarja "drzave" shranim v seznam ...
    ArrayList<String> seznamDrzav = new ArrayList<>(drzave.keySet());
    // ... in ta seznam uredim (po abecedi)
    Collections.sort(seznamDrzav);
    System.out.println("Kratice, urejene po abecedi: ");
    System.out.println(seznamDrzav);
    System.out.println("");
    
    
    // urejanje kratic glede na velikost drzave, kateri pripadajo
    Collections.sort(seznamDrzav, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        // o1 in o2 sta dve kratici; iz slovarja "drzave" pridobim pripadajoca objekta 
        // in primerjam rezultat metod getSteviloPrebivalcev()
        return drzave.get(o2).getSteviloPrebivalcev() - drzave.get(o1).getSteviloPrebivalcev();
      }      
    });
    System.out.println("Urejeno po velikosti (število prebivalcev):  ");
    System.out.println(seznamDrzav);    
  }
}
