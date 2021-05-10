package predavanje11;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class OI {

  public static HashMap<String, Drzava> preberiDrzave(String imeDatoteke) {
    HashMap<String, Drzava> drzave = new HashMap();
    
    try {
      Scanner sc = new Scanner(new File(imeDatoteke));
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
    return drzave;
  }
  
  public static void main(String[] args) {
    //args = new String[]{"viri/drzave.txt"};
    
    HashMap<String, Drzava> drzave = preberiDrzave(args[0]);
    
    
//    Izpis vseh prebranih držav    
//    for (String kratica : drzave.keySet()) {
//      System.out.println(drzave.get(kratica));
//    }
    
    // izpis države s kratico "USA"
    System.out.println(drzave.get("USA"));
  }
}
