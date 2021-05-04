package predavanje11.risanje;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Osnovni razred Lik, iz katerega bomo izpeljali podrazrede (Krog, Kvadrat, ...)
 * @author tomaz
 */
abstract public class Lik {
  private static final int K = 2;
  
  protected double x;
  protected double y;
  protected Color barva;
  
  protected boolean selected;

  public Lik(double x, double y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
    
    this.selected=false;
  }
  
  abstract void narisi();
  abstract boolean pripadaLiku(double x, double y);
  abstract Rectangle getObmocjeLika();
  
  
  void premakni(double deltaX, double deltaY) {
    this.x += deltaX;
    this.y += deltaY;
  }
  
  void narisiKvadratke() {    
    Rectangle r = getObmocjeLika();
    StdDraw.setPenColor(Color.gray);
    StdDraw.filledRectangle(r.x        , r.y         , K/2, K/2);
    StdDraw.filledRectangle(r.x+r.width, r.y         , K/2, K/2);
    StdDraw.filledRectangle(r.x        , r.y-r.height, K/2, K/2);
    StdDraw.filledRectangle(r.x+r.width, r.y-r.height, K/2, K/2);
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public Color getBarva() {
    return barva;
  }

  public void setBarva(Color barva) {
    this.barva = barva;
  }

  
  
}
