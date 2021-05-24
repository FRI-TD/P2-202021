package predavanje14;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 * FlowLayout - komponente razporeja v eno vrstico; če je vrstica prekratka, jih
 * razporejevalnik prikaže v drugi, tretji, ... vrstici
 * @author tomaz
 */
public class FlowLayoutPrimer {
  public static void main(String[] args) {
    JFrame okno = new JFrame("FlowLayout DEMO");
    okno.setLocation(400,400);
    
    // ustvarim komponente ...
    JButton gumb1 = new JButton("Gumb 1");
    JButton gumb2 = new JButton("Gumb 2");
    JButton gumb3 = new JButton("Gumb 3");
    JButton gumb4 = new JButton("Gumb 4");
    JButton gumb5 = new JButton("Gumb 5");
    
    // komponente na oknu bodo razporejene s FlowLayout razporejevalnikom
    okno.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
    
    // ... in jih dodam na okno
    okno.add(gumb1);
    okno.add(gumb2);
    okno.add(gumb3);
    okno.add(gumb4);
    okno.add(gumb5);
    
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    okno.pack();
    okno.setVisible(true);
  }
}
