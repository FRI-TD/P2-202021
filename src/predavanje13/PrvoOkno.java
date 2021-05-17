package predavanje13;

import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * Izdelava okna s pomočjo razreda JFrame
 * @author tomaz
 */
public class PrvoOkno {
  
  public static void main(String[] args) {
    // toolkit nosi osnovne informacije o velikosti zaslona in podobno
    Toolkit tk = Toolkit.getDefaultToolkit();
    
    // ustvarim okno ...
    JFrame okno = new JFrame();    
    
    // ... mu nastavim velikost in polozaj ter naslov ...
    okno.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
    okno.setLocation(400,400);
    okno.setTitle("Prvo okno");

    // ... in ga prikažem
    okno.setVisible(true);    
   
    // kaj naj se zgodi, ko uporabnik pritisne gume CLOSE (x)
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // ustvarim še dialog ...
    JDialog d1 = new JDialog(okno, true); // modalni dialog (dokler ga ne zapreš, kontrole ne moreš prenesti v drugo okno).
    d1.setSize(100,100);
    d1.setLocation(100, 100);      
    // ... in ga prikažem
    d1.setVisible(true);
  }

}
