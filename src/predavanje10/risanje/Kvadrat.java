package predavanje10.risanje;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 *
 * @author tomaz
 */
public class Kvadrat extends Lik {

  private double a;

  public Kvadrat(double x, double y, double a, Color barva) {
    super(x, y, barva);
    this.a = a;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(barva);    
    StdDraw.filledRectangle(x, y, a/2, a/2);
  }

  
  
  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }
  
  
}
