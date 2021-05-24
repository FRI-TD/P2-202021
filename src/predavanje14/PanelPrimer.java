package predavanje14;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 * Primer okna, ki vsebuje dva panela - eden v zgodnji vrstici, drugi pa
 * se razteza čez celotno preostalo površino okna.
 * 
 * @author tomaz
 */
public class PanelPrimer {
  
  public static void main(String[] args) {
    JFrame okno = new JFrame("Panel - primer");
    
    okno.setSize(200,200);
    okno.setLocation(500, 500);
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    // barva ozadja
    panel.setBackground(Color.red); 
    // rumeno obrobljen okvir
    panel.setBorder(BorderFactory.createLineBorder(Color.yellow));
    okno.add(panel);
    
    JPanel zgornjiPanel = new JPanel();
    // obroba okvira z naslovom
    zgornjiPanel.setBorder(BorderFactory.createTitledBorder("Zgornji panel"));
    okno.add(zgornjiPanel, BorderLayout.PAGE_START);
    
    okno.setVisible(true);
  }
}
