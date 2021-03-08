package predavanje4;

import java.util.Scanner;
import java.io.File;
import java.util.Locale;

/**
 * Program prebere datoteko, v kateri so zapisane vrednosti za bitcoin in izpiše
 * datum največje in najmanjše vrednosti.
 *
 * @author tomaz
 */
public class Bitcoin {

  public static void main(String[] args) throws Exception {
    // ker so realna števila (vrednost) v datoteki zapisana z decimalno piko,
    // (in ne decimalno vejico, kot je v navadi v Sloveniji), javi naročim, 
    // naj v tem programu uporablja angleški (ameriški) način zapisa
    Locale.setDefault(Locale.ENGLISH);

    // s Scannerjem se "povežem" na datoteko; pozor: obvezno sc.close() na koncu! 
    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));

    // če želim, da bo prvi podatek gotovo manjši od tega, ki ga imam shranjenega 
    // tu, za začetek uporabim največjo možno vrednost
    double minVrednost = Double.MAX_VALUE;
    String minDatum = "";

    // podobno: uporabim najmanjšo možno vrednost; sedaj bo vsak 
    // podatek gotovo večji
    double maxVrednost = Double.MIN_VALUE;
    String maxDatum = "";

    // datoteko berem, dokler je v njej še kakšna beseda
    while (sc.hasNext()) {
      String datum = sc.next();            // preberem datum  ...
      double vrednost = sc.nextDouble();   // ... in vrednost valute

      // če je vrednost pravkar prebrane valute manjša od do sedaj
      // najmanjše prebrane vrednosti, si jo zapomnim!
      if (vrednost < minVrednost) {
        minVrednost = vrednost;
        minDatum = datum;
      }

      // če je vrednost pravkar prebrane valute večja od do sedaj
      // največje prebrane vrednosti, si jo zapomnim!      
      if (vrednost > maxVrednost) {
        maxVrednost = vrednost;
        maxDatum = datum;
      }

    }
    System.out.printf("Minimalna  vrednost %.2f na datum %s\n", minVrednost, minDatum);
    System.out.printf("Maksimalna vrednost %.2f na datum %s\n", maxVrednost, maxDatum);

    sc.close();
  }

}
