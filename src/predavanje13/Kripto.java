package predavanje13;

import java.net.URL;
import java.util.Scanner;

/**
 * Pretvornik kripto valut. Podatke preberem s spletne strani https://min-api.cryptocompare.com.
 * @author tomaz
 */
public class Kripto {
  public static void main(String[] args) throws Exception {
    String from = "BTC"; // vhodna valuta
    String to   = "ETH"; // izhodna valuta
    
    // url za pridobivanje podatkov - potrebuje podatka fsym (==from) in tsyms (==to) 
    URL url = new URL("https://min-api.cryptocompare.com/data/price?fsym="+from+"&tsyms="+to);
    Scanner sc = new Scanner(url.openStream());
    String tecaj = sc.nextLine(); // rezultat je samo ena vrstica v json  obliki 
    sc.close();
    
    // iz json niza odstranim vse nepotrebne informacije (ostane le številka)
    tecaj = tecaj.replaceAll("["+to+":\"{}]", ""); 
    
    System.out.printf("1 %s = %s %s\n", from, tecaj, to);
  }

}
