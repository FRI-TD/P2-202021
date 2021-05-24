package predavanje14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

// Poslusalec, ki lahko posluša dogodke tipa "action" (to so dogodki, ki se zgodijo,
// ko uporabnik pritisne gumb (JButton); če je poslušalec registriran na gumbu, 
// se bo ob pritisku na bumb poklicala metoda actionPerformed().
class MojPoslusalec implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.exit(0);
  }
}

/**
 * Prikaz delovanja razporejevalnika GridBagLayout ter poslušalcev.
 * 
 * @author tomaz
 */
public class GridBagLayoutPrimer {
  public static void main(String[] args) {
    JFrame okno = new JFrame("GridBag demo");
    // komponente na oknu bodo razporejene z "BorderLayout" razporejevalnikom
    okno.setLayout(new BorderLayout());

    // v zgornji vrstici okna bo ena sama komponenta - panel v obliki kvadrata zelene barve;
    // za bo ta kvadrat poravnan sredinsko, ga odložimo na panel, ki uporablja FLowLayout 
    // razporejanje (zgornjiPanel), tega pa odložćimo v zgornjo vrstico okna.
    JPanel zgornjiPanel = new JPanel(new FlowLayout());        
    JPanel zeleniKvadratPanel = new JPanel();
    zeleniKvadratPanel.setBackground(Color.green);
    zeleniKvadratPanel.setPreferredSize(new Dimension(300,300));         
    zgornjiPanel.add(zeleniKvadratPanel);    
    okno.add(zgornjiPanel, BorderLayout.PAGE_START);
    
    // na sredino okna bo panel, ki bo razporejen z GridBag razporejevalnikom ...
    JPanel centerP = new JPanel();    
    centerP.setLayout(new GridBagLayout());
    okno.add(centerP, BorderLayout.CENTER);
    
    // ... in bo vseboval naslednje komponente:
    JLabel     imeL      = new JLabel("Ime:");
    JLabel     priimekL  = new JLabel("Priimek:");
    JTextField imeTF     = new JTextField();
    JTextField priimekTF = new JTextField();
    JTextArea  opisTA    = new JTextArea();        
    
    // Pri dodajanju komponent na panel, ki ga nadzira GridBagLayout, moram podati
    // vse omejitve, ki določajo položaj te komponente. 
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx= 0;
    gbc.gridy= 0;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(5, 5, 0, 0);
    centerP.add(imeL, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx= 1;
    gbc.gridy= 0;
    gbc.weightx=1;
    gbc.fill=GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(5, 5, 0, 5);
    centerP.add(imeTF, gbc);    
    
    gbc = new GridBagConstraints();
    gbc.gridx= 0;
    gbc.gridy= 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(5, 5, 0, 0);
    centerP.add(priimekL, gbc);    
    
    gbc = new GridBagConstraints();
    gbc.gridx= 1;
    gbc.gridy= 1;
    gbc.weightx=1;
    gbc.fill=GridBagConstraints.HORIZONTAL;  
    gbc.insets = new Insets(5, 5, 0, 5);
    centerP.add(priimekTF, gbc);    
    
    // text area dodam na scroll pane, da se bodo (po potrebi) prikazali pomični trakovi
    JScrollPane jsp = new JScrollPane(opisTA);
    
    gbc = new GridBagConstraints();
    gbc.gridx= 0;
    gbc.gridy= 2;
    gbc.weightx = 1;
    gbc.weighty = 1;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.gridwidth = 2;
    centerP.add(jsp, gbc);    
        
     
    // V spodnjo vrstico okna dodam panel z gumbi
    JPanel spodajP = new JPanel();
    spodajP.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton okB = new JButton("OK");
    JButton cancelB = new JButton("Cancel");
    JButton helpB = new JButton("Help");
    spodajP.add(okB);
    spodajP.add(cancelB);
    spodajP.add(helpB);
    okno.add(spodajP, BorderLayout.PAGE_END); 
    
    // na gumb OK registriram poslušalca (MojPoslusalec)
    okB.addActionListener(new MojPoslusalec());
    
    // na gumb Cancel registriram poslušalca, ki ga opišem kar kot
    // anonimni notranji razred
    cancelB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {        
        opisTA.append("Cancel");
      }
    });
     
    // ob pritisku na gumb "Help" se vsebina iz poljas "Ime"
    // prepiše v polje "Priimek"
    helpB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String ime = imeTF.getText();
        priimekTF.setText(ime);
      } 
    });
    
    // na zelenem panelu registriram poslušalca za premik miške; ob premiku miške 
    // se bo klicala metoda mouseMoved()
    zeleniKvadratPanel.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        // objekt e nosi podatke o položaju miške
        int x = e.getX();
        int y = e.getY();
        
        opisTA.append(String.format("(%d, %d)\n", x, y));        
      }            
    });        
        
      
    
    okno.pack();
    okno.setVisible(true);
  }

}
