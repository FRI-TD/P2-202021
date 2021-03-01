package predavanje3;

import java.util.Scanner;

/**
 * Program prebere ime in pozdravi uporabnika.
 * @author tomaz
 */
public class PreberiIme {
  
  public static void main(String[] args) {
    // bralnik povezem s tipkovnico ...
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Vpisi ime: ");
    
    // ... in iz nje preberem ime (celotno vrstico); opomba: ce bi 
    // uporabil metodo next(), bi prebral samo prvo besedo (kar je v 
    // vecini primerov OK, tezave bi imel le z "dvojnimi imeni", kot 
    // na primer Ana Marija; v tem primeru bi spr. ime vsebovala le "Ana".
    String ime = sc.nextLine();
    System.out.printf("Pozdravljen, %s!\n", ime);
  }

}
