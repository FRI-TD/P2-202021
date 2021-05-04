package predavanje11.risanje;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Glavni programa - uporaba razredov Lik, Krog, Pravokotnik, Kvadrat.
 * 
 * @author tomaz
 */
public class Liki {

  static final int D = 5;
  
  public static void main(String[] args) {
    StdDraw.setScale(0, 100);
    
    ArrayList<Lik> liki = new ArrayList();
    
    liki.add(new Krog(50,50, 30, Color.red));
    liki.add(new Pravokotnik(30,20, 20, 30, Color.blue));  
    liki.add(new Kvadrat(5, 95, 10, Color.yellow));
    
    StdDraw.enableDoubleBuffering();
    while (true) {
      StdDraw.clear();
      
      if (StdDraw.isMousePressed()) {
        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();
        
        for (int i = 0; i < liki.size(); i++) {
          liki.get(i).selected = liki.get(i).pripadaLiku(x, y);
        } 
      }
      
      if (StdDraw.hasNextKeyTyped()) {
        char c = StdDraw.nextKeyTyped();
        switch (c) {
          case 'w':
            for(Lik lik : liki)
              if (lik.selected)
                lik.premakni(0, D);            
            break;
          case 's':
            for(Lik lik : liki)
              if (lik.selected)              
                lik.premakni(0, -D);            
            break;
          case 'a':
            for(Lik lik : liki)
              if (lik.selected)              
                lik.premakni(-D, 0);
            break;
          case 'd':
            for(Lik lik : liki)
              if (lik.selected)
                lik.premakni(D, 0);
            break;            
        }
      }
      
      for (int i = 0; i < liki.size(); i++) {
        liki.get(i).narisi();
        if (liki.get(i).selected)
          liki.get(i).narisiKvadratke();
      }
            
      
      StdDraw.show();
      StdDraw.pause(100);
    }        
  }
}
