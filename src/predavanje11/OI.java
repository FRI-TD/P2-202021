package predavanje11;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class OI {

  public static void main(String[] args) {
    HashMap<String, Drzava> drzave = new HashMap();
    
    try {
      Scanner sc = new Scanner(new File("viri/drzave.txt"));
      // dokler so v datoteki še podatki ...
      while(sc.hasNextLine()) {
        // ... preberem vrstico po vrstici ...
        String vrstica = sc.nextLine();
        // ... vrsdtico razbijem po znaku ":" ...
        String[] deli = vrstica.split(":");
        if (deli.length == 3) {
          String kratica = deli[0];
          String glMesto = deli[1];
          int stPrebivalcev = Integer.parseInt(deli[2]);
          
          // ... in ustvarim objekt razreda "Drzava" in ga ustavim v slovar.
          drzave.put(kratica, new Drzava(kratica, glMesto, stPrebivalcev));
        }
      }
      sc.close();
    } catch (Exception e) {
      System.out.println("Napaka pri branju datoteke: " + e.toString());      
    }
    
//    Izpis vseh prebranih držav    
//    for (String kratica : drzave.keySet()) {
//      System.out.println(drzave.get(kratica));
//    }
    
    // izpis države s kratico "USA"
    System.out.println(drzave.get("USA"));
  }
}
