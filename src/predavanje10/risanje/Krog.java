package predavanje10.risanje;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 *
 * @author tomaz
 */
public class Krog extends Lik {
  private double r; // polmer

  public Krog(double x, double y, double r, Color barva) {
    super(x, y, barva);
    this.r = r;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(barva);
    StdDraw.filledCircle(x, y, this.r);
  }

  
  
  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }    

}
