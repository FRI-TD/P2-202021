package predavanje10.risanje;

import java.awt.Color;

/**
 * Osnovni razred Lik, iz katerega bomo izpeljali podrazrede (Krog, Kvadrat, ...)
 * @author tomaz
 */
abstract public class Lik {
  protected double x;
  protected double y;
  protected Color barva;

  public Lik(double x, double y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
  }
  
  abstract void narisi();
  

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
