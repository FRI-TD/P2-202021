package predavanje3;

/**
 * Program sesteje in izpise vsoto prvega in drugega argumenta.
 * Ker so argumenti tipa String, je treba oba argumenta najprej 
 * pretvoriti v celo stevilo (Integer.parseInt()), šele nato ju 
 * lahko sestejemo.
 * 
 * @author tomaz
 */
public class Racunalo {

  
  public static void main(String [] args) {
    // pri delu z argumenti je prav, da preverimo, ce je podano 
    // stevilo argumentov pravilno; ce ni, program izpise sporocilo
    // o napaki in konca
    if (args.length != 2) {
      System.out.println("Uporaba: java Racunalo a b");
      System.exit(0); // koncam s programom (exitStatus=0)
    }
    
    // pretvorba argumentov iz String v int
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
        
    // izpis
    System.out.printf("%d + %d = %d\n", a, b, a+b);
  }
}
