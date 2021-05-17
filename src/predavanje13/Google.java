package predavanje13;

import java.net.URL;
import java.util.Scanner;

/**
 * Branje vsebina spletne strani
 * @author tomaz
 */
public class Google {
  public static void main(String[] args) throws Exception {
    // naslov (url) spletne strani
    URL url = new URL("http://www.google.com");
    
    // s Scannerjem se povežem na spletno stran ...
    Scanner sc = new Scanner(url.openStream());
    
    // ... in berem vrstico po vrstici
    while (sc.hasNextLine()) {
      String v =  sc.nextLine();
      System.out.println(v);
    }
    
    // ... na koncu pa seveda zaprem povezavo do spleta!
    sc.close();
  }

}
