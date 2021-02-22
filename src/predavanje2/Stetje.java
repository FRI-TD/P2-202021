package predavanje2;

/**
 * Program posteje, koliko besed se zacne na dano crko.
 * 
 * @author tomaz
 */
public class Stetje {
  
  public static void main(String [] args) {
    // tabela nizov - deklaracija in inicializacija: ustvarim tabelo in vanjo     
    // takoj zapisem vrednosti; velikost tabele bo java izracunala sama
    String [] besede = new String [] {
      "prva", "druga", "pomlad", "zima", "FRI", "beseda"
    };
    
    // crka, ki jo iscem
    char c = 'x';
    
    // koliko besed v tabeli besede se zacne na crko c
    int koliko = 0; // koliko besed na crko, ki je shranjena v c,  sem ze nasel
    for(int i = 0; i < besede.length; i++) { // i++ === i = i + 1
      // ali se i-ta beseda zacne na crko c?
      if (besede[i].charAt(0) == c) {
        koliko = koliko + 1;
      }
    }
     
    System.out.printf("Stevilo besed na crko '%c' je %d\n", c, koliko);
  }

}
