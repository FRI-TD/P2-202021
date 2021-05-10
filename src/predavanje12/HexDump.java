package predavanje12;

import java.io.File;
import java.io.FileInputStream;

/**
 * Program izpiše datoteko, katere ime je podano kot prvi argument, v HexDump obliki.
 * @author tomaz
 */
public class HexDump {

  // 
  public static void main(String[] args) {
    // ime datoteke je podano kot prvi argument
    File f = new File(args[0]);
    
    try {
      // z fis se "povežem" na datoteko, iz katere bom bral ...
      FileInputStream fis = new FileInputStream(f);
      
      int i=0;
      // .... dokler datoteka še vsebuje podatke ...
      while(fis.available() > 0) {
        // ... berem znak po znaku ...
        int z = fis.read(); i++;
        // ... in za izpisujem na zaslon v hex obliki
        System.out.printf("%02X ", z);
        
        // vsakih 16 znakov pa "skočim" v novo vrstico
        if (i==16) {
          System.out.println();
          i=0;
        }
      }
      
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
}
