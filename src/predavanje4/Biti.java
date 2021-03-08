package predavanje4;

/**
 * Program z metodo steviloBitov() presteje stevilo prizganih bitov v danem
 * stevilu in rezultat izpise na zaslon.
 * 
 * @author tomaz
 */
public class Biti {
  
  /**
     * Metoda presteje in vrne stevilo prizganih bitov v stevilu n.
     * Metoda gleda samo zadnji prizgani bit - če je ta 1, poveča
     * stevec bitov - nato stevilo "premakne v desno" (shift right, >> 1).
     * Postopek ponavlja, dokler je n še različen od nič (ima še kakšen bit, 
     * ki ga je treba pošteti).
  */
  static int steviloBitov(int n) {
    int stB = 0; // stevilo prizganih bitov
   
    // 
    while (n != 0) {
      if ((n & 1) == 1) { // ali je prizgan "spodnji" bit
        stB++;        
      }
      // pomik v desno; najbolj desni bit s tem izgubimo, a 
      // nič hudega, saj smo ga že pošteli
      n = n >> 1;         
    }
    
    return stB;
  }
  
  public static void main(String[] args) {
    int x = 40;
    
    int steviloPrizganih = steviloBitov(x);
    
    
    System.out.printf("Stevilo prizganih bitov v stevilu %d je %d\n",
            x, steviloPrizganih);    
  }

}
