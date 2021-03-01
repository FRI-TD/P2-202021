package predavanje3;

import java.util.Random;

/**
 * Program ustvari in izpise 7 nakljucnih stevil med 1 in 39.
 * @author tomaz
 */
public class Loto {
  
  public static void main(String[] args) {
    // kot "ustvarimo" generator, lahko dodamo seme (v tem primeru 42);
    // na ta nacin bomo vedno dobili isto nakljucno zaporedje; ce semena
    // ne bi podali (.... new Random()), bi bili zaporedje vsakic drugacno.
    Random rnd = new Random(42);  
    for(int i=0; i<7; i++) {
      // nextInt(39) ustvari stevilo med 0 in 38; ce temu pristejemo 1,
      // dobimo stevilo med 1 in 39.
      int x = 1 + rnd.nextInt(39); 
      
      // ustvarjeno kanljucno stevilo se izpisemo (in dodamo locilo - presledek)
      System.out.print(x + " ");
    }
    System.out.println();
  }

}
