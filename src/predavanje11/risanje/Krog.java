package predavanje11.risanje;

import predavanje10.risanje.*;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.awt.Rectangle;

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

  @Override
  boolean pripadaLiku(double x, double y) {
    return (x-this.x)*(x-this.x) + (y-this.y)*(y-this.y) <= r*r;
  }

  @Override
  Rectangle getObmocjeLika() {
    return new Rectangle((int)(x-r), (int)(y+r), (int)(2*r), (int)(2*r));
  }

  
  
  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }    

}
