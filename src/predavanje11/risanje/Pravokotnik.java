package predavanje11.risanje;

import predavanje10.risanje.*;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author tomaz
 */
public class Pravokotnik extends Lik {

  private double a;
  private double b;

  public Pravokotnik(double x, double y, double a, double b, Color barva) {
    super(x, y, barva);
    this.a = a;
    this.b = b;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(barva);    
    StdDraw.filledRectangle(x, y, a/2, b/2);
  }

  @Override
  boolean pripadaLiku(double x, double y) {
    return (x >= this.x - this.a/2) && (x <= this.x + this.a/2) &&
           (y >= this.y - this.b/2) && (y <= this.y + this.b/2);
  }

  @Override
  Rectangle getObmocjeLika() {
    return new Rectangle((int)(x-a/2), (int)(y+b/2), (int)a, (int)b);
  }
  
  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }
  
  
}
