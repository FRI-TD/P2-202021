package predavanje2;

/**
 * Izpis formatiranega besedila - tabela za ceno sreck.
 * 
 * @author tomaz
 */
public class Srecke {
  
  public static void main(String [] args) {
    // dobro je, ce konstante nastavimo na zacetku, da so dobro vidne
    final double cenaEne = 1.25;
    
    // najprej izpisem "glavo" tabele ...
    System.out.println("Stevilo sreck | Cena (EUR)");
    System.out.println("--------------------------");
    // ... nato v zanki izpisem se posamezne vrstice tabele
    for(int i=1; i<=10; i=i+1) {
      System.out.printf("%5d         |   %5.2f\n", i, i*cenaEne);
    }
  }

}
