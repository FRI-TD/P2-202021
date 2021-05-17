package predavanje13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Pretvorba datoteke iz UTF-8 v CP1250 kodirni sistem. 
 * 
 * @author tomaz
 */
public class Pretvornik {

  public static void main(String[] args) {
    // vhodna in izhodna datoteka
    File f1 = new File("viri/b1");
    File f2 = new File("viri/b1.cp1250");
    
    try {
      // za branje tekstovne datoteke uporabim InputStreamReader 
      FileInputStream fis = new FileInputStream(f1);
      InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // drugi parameter je ime vhodnega kodirnega sistema
      
      // za pisanje tekstovne datoteke uporabim OutputStreamWriter 
      FileOutputStream fos = new FileOutputStream(f2);
      OutputStreamWriter osw = new OutputStreamWriter(fos, "CP1250"); // drugi parameter je ime izhodnega kodirnega sistema
      
      // znake iz vhodne datoteke prepisujem enega za drugim, dokler obstajajo
      while (isr.ready()) {
        int z = isr.read();
        osw.write(z);
      } 
        
      // obvezno zapiranje obeh datotek!
      osw.close();
      isr.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
}
