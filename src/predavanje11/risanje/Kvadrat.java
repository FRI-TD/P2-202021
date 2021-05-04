package predavanje11.risanje;

import java.awt.Color;

/**
 * Kvadrat ima vse lastnosti enake kot pravokotnik, edina razlika je v tem, da 
 * je pri Kvadratu b==a. Zato Kvadrat naredim tako, da namesto drugega parametra 
 * velikosti podam še enkrat a. Vse ostalo ostane enako!
 * 
 * @author tomaz
 */
public class Kvadrat extends Pravokotnik {

  Kvadrat(double x, double y, double a, Color barva) {
    super(x, y, a, a, barva);
  }
}
