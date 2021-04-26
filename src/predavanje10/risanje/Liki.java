package predavanje10.risanje;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 *
 * @author tomaz
 */
public class Liki {

  public static void main(String[] args) {
    StdDraw.setScale(0, 100);
    
    Lik[] liki = new Lik[100];
    int stLikov = 0;
    
    liki[stLikov++] = new Krog(50,50, 30, Color.red);
    liki[stLikov++] = new Kvadrat(10,20, 20, Color.blue);
    
    for (int i = 0; i < stLikov; i++) {
      liki[i].narisi();
    }
  }
}
