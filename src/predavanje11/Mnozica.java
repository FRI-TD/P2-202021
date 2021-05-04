package predavanje11;

import java.awt.Color;
import java.util.*;

/**
 * Uporaba razreda TreeSet. Demonstracija uporabe metod 
 *   add(), contains(), size(), remove(), iterator().
 *
 * @author tomaz
 */
public class Mnozica {
  public static void main(String[] args) {
    // ustvarim novo mnozico ...
    Set<String> dnevi = new TreeSet();
    
    // in vanjo dodam poljubno stevilo (enoličnih) elementov
    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("CET");
    dnevi.add("PET");
    dnevi.add("SO");
    dnevi.add("NE");
    
    // dnevi.add(17);    
    // dnevi.add(new predavanje11.risanje.Krog(0, 0, 0, Color.gray));
    
    if (dnevi.contains("PON"))
      System.out.println("DA");
    else
      System.out.println("NE");
    
    System.out.println(dnevi.size());
    
    dnevi.add("PON");
    dnevi.add("TOR");
    System.out.println(dnevi.size());
    dnevi.remove("PON");
    System.out.println(dnevi.size());
    
    System.out.println("----------------");
    Iterator<String> it = dnevi.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    
    System.out.println("*********************");
    for(String dan : dnevi) {
      System.out.println(dan);
    }
    
  }

}
