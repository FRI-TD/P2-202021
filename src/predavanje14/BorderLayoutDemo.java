package predavanje14;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 * Uporaba BorderLayout razporejevalnika. 
 * @author tomaz
 */
public class BorderLayoutDemo {
  public static void main(String[] args) {
    JFrame okno = new JFrame("BorderLayout DEMO");
    okno.setLocation(400,400);
    
    JButton gumb1 = new JButton("Gumb 1");
    gumb1.setPreferredSize(new Dimension(1,50));
        
    JButton gumb3 = new JButton("Gumb 3");
    gumb3.setPreferredSize(new Dimension(200,1));
    
    JButton gumb4 = new JButton("Gumb 4");
    JButton gumb5 = new JButton("Gumb 5");
    
    // en panel z dvema gumboma na desni strani
    JPanel spodnjiPanel = new JPanel();
    spodnjiPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
    JButton okB     = new JButton("OK");
    JButton cancelB = new JButton("Cancel");
    spodnjiPanel.add(okB);
    spodnjiPanel.add(cancelB);
    
    // komponente na oknu bodo razporejene s BorderLayout razporejevalnikom
    okno.setLayout(new BorderLayout()); 
    
    okno.add(gumb1, BorderLayout.PAGE_START);      // komponenta se doda v zgornjo vrstico
    okno.add(gumb3, BorderLayout.LINE_START);      // komponenta se doda v sredino levo
    okno.add(gumb4, BorderLayout.LINE_END);        // komponenta se doda v sredino desno
    okno.add(gumb5);                               // komponenta se doda v sredinsko cono    
    okno.add(spodnjiPanel, BorderLayout.PAGE_END); // komponenta se doda v spodnjo vrstico
    
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    okno.pack();
    okno.setVisible(true);
  }
}
