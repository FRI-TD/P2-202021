package predavanje14;

import javax.swing.*;

/**
 *
 * Absolutna razporeditev komponent - za vsako komponento povemo, kje se bo 
 * nahajala in koliko bo velika. 
 * 
 * @author tomaz
 */
public class AbsoultnoPozicioniranje {
  
  public static void main(String[] args) {
    JFrame okno = new JFrame("Imenik");
    
    // velikos in položaj okna
    okno.setSize(300,150);
    okno.setLocation(400,400);
    
    // ustvarimo komponente, ki jih bomo prikazali na oknu
    JLabel imeL      = new JLabel("Ime");
    JTextField imeTF = new JTextField();
    JTextArea vpisTA = new JTextArea();
    JButton isciB    = new JButton("Išči");    
    
    // za razporejanje bomo uporabili absolutno pozicioniranje
    okno.setLayout(null); 
    
    // za vsako komponento povemo, kje se bo nahajala in koliko bo velika
    imeL. setBounds(10,10,40,20);
    imeTF.setBounds(60, 10, 120, 20);
    isciB.setBounds(220, 10, 70, 20);
    vpisTA.setBounds(10,40,280,80);
    
    // komponente dodamo na okno
    okno.add(imeL);
    okno.add(imeTF);
    okno.add(vpisTA);
    okno.add(isciB);
    
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }

}
