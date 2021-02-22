package predavanje2;

/**
 * Izpis argumentov programa
 * 
 * @author tomaz
 */
public class Argumenti {
  
  public static void main(String [] args) {
    // stevilo vseh argumentov dobim v "args.length"
    System.out.println("Stevilo argumentov: " + args.length);
    
    // za izpis vseh arumentov uporabim zanki od 0 do args.length-1
    for(int i=0; i<args.length; i++) {    
      System.out.printf("%d. argument: %s\n", i, args[i]);
    }
  }

}
