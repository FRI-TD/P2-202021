package predavanje14;

import java.awt.*;
import javax.swing.*;

/**
 * Prikaz razporeditve komponent v mrežo.
 * 
 * @author tomaz
 */
public class GridLayoutDemo {
  public static void main(String[] args) {
    JFrame okno = new JFrame("BorderLayout DEMO");
    okno.setLocation(400,400);
    
    // komponente v oknu bodo razporejene v mrežo 5x5
    okno.setLayout(new GridLayout(5, 5));
    for (int i = 0; i < 23; i++) {
      // ustvarim gumb in ga po vrsti dodam v mrežo
      JButton gumb = new JButton("Gumb " + i);
      okno.add(gumb);
      
      // v sredni vrstici v skrajno levem in skrajno desnem polju ne 
      // dodam gumba ampak "prazen prostor" (neviden JPanel)
      if (i==9 || i==12)
        okno.add(new JPanel());
    }
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    okno.pack();
    okno.setVisible(true);
  }
}
