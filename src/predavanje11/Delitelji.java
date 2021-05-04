package predavanje11;

import java.util.*;

/**
 * Program izpise unijo in presek dveh množic.
 * 
 * @author tomaz
 */
public class Delitelji {

  /**
   * Metoda vrne množico vseh deliteljev števila a
   */
  static Set<Integer> delitelji(int a) {
    Set<Integer> delitelji = new TreeSet();
    for (int i = 1; i <= a; i++) {
      if (a % i == 0)
        delitelji.add(i);
    }
    return delitelji;
  }
  
  public static void main(String[] args) {
    Set<Integer> dA = delitelji(152);
    System.out.println(dA);
    
    Set<Integer> dB = delitelji(114);
    System.out.println(dB);
    
    // unija mnozic dA in dB
    Set<Integer> unija = new TreeSet(dA);
    unija.addAll(dB); // v mnozico "unija" dodaj vse elemente iz množice dB
    System.out.println(unija);
    
    // unija mnozic dA in dB
    Set<Integer> presek = new TreeSet(dA);
    presek.retainAll(dB); // v mnozici "presek" obdrži le elemente, ki so v množici dB
    System.out.println(presek);
    
  }
  
}
