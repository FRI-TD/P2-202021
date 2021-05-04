package predavanje11;

import java.util.ArrayList;

/**
 * Primer uporab seznama imen s podatkovno zbirko tipa ArrayList
 * @author tomaz
 */
public class ArrayListPrimer {
  
  public static void main(String[] args) {
    // ustvarim prazen seznam (elementi seznama bodo tipa String)
    ArrayList<String> imena = new ArrayList();
    
    // dodam poljubno število elementov
    imena.add("Micka");
    imena.add("Miha");
    imena.add("Micka");
    imena.add("Janez");
    
    // število elementov v seznamu dobim s klicem metode size()
    System.out.println(imena.size()); // 4
    
    // do elementov lahko dostopa preko indeksa
    System.out.println(imena.get(1)); // imena[1]
    
    // elemente na danem indeksu lahko tudi spremenim
    imena.set(1, "miha");             // imena[1]="miha"            
    
    System.out.println("******************");
    // odstranim vedno le prvi element (v tem primeru ena "Micka" ostane)
    imena.remove("Micka");
    
    // ispis elementov seznama s pomočjo "foreach" zanke
    for (String ime : imena) {
      System.out.println(ime);
    }
    

  }

}
