package predavanje3;

import java.util.Scanner;
import java.io.File;

/**
 * Kratka demonstracija uporabe razreda Scanner za branje datoteke.
 * 
 *  - povežemo se na datoteko "viri/besede.txt"; ime datoteke smo
 *    podali na relativen način (mapa "viri", v kateri je datoteka
 *    besede.txt, se nahaja v folderju projekta);
 * 
 *  - v glavi metode main() smo dodali "throws Exception", da smo se 
 *    izognili morebitnim tezavam pri delu z datoteko; kasneje bomo 
 *    namesto tega uporabili mehanizme za delo z izjemami (try-catch)
 *  - 
 * 
 * @author tomaz
 */
public class BeriBesede {
  
  public static void main(String[] args) throws Exception {
    Scanner datoteka = new Scanner(new File("viri/besede.txt"));
    
    // datoteko beremo, dokler je v njej se kaksna beseda
    while (datoteka.hasNext()) {
      // preberemo eno besedo iz datoteke ...
      String beseda = datoteka.next();
      // ... in jo izpisemo na zaslon
      System.out.println(beseda);
    }
    
    // na koncu moramo datoteko obvezno zapreti!
    datoteka.close();
  }

}
