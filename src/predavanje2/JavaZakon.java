package predavanje2;

/**
 * Večkratni ostevilceni izpis besedila "Java je ZAKON!" - uporaba zanke for.
 * @author tomaz
 */
public class JavaZakon {
  
  public static void main(String [] args) {
    int i;  // deklaracija spremenljivke i za uporabo v zanki
    
    // zanka for je sestavljena iz treh delov (loceni so s podpicjem):
    //   začetka vrednost spremenljivke:   i=1
    //   do kdaj se zanka izvaja:          i<=10
    //   kaj se zgodi po vsaki iteraciji:  i=i+1
    for(i=1; i<=10; i=i+1) {
      System.out.println(i + ". Java je ZAKON!");    
    }
    
    // deklaracijo spremenljivke lahko opravimo tudi v zanki
    for(int j=0; j<=5; j=j+1) {
      System.out.println(j);
    }
  }

}
