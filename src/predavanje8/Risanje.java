package predavanje8;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 * Program za demonstracijo uporabe knjižnice StdDraw.
 * 
 * @author tomaz
 */
public class Risanje {

  // Risanje tarče (10 rumenih krogov na črni podlagi)
  static void tarca() {
    // nastavim koordinatni sistem - (0, 0) je v sredino, skrajna leva spodnja 
    // točka je (-100,-100), skrajna desna zgornja pa (100,100).
    StdDraw.setScale(-100, 100);
    
    // "pobrišem" površino s črno barvo (in s tem ustvarim črno ozadje)
    StdDraw.clear(Color.black);
    
    StdDraw.setPenColor(Color.yellow);
    for (int r = 10; r <= 100; r = r + 10) {
      // 10 koncentričnih krogov
      StdDraw.circle(0, 0, r);
    }
  }
  
  static void barvniKvadratki() {
    int K = 10;
    
    StdDraw.setScale(0, 25*K);
    
    for (int i = 0; i < 25; i++) { // po vrsticah
      for (int j = 0; j < 25; j++) { // po stolpcih
        // barva: i*rdeča + j*zelena (zgornji levi kot bo povsem zelen,
        // spodnji desni povsem rdeč, vmes pa bodo konbinacije teh dveh barv).
        StdDraw.setPenColor(i*10, j*10, 0);
        
        // narišem kvadartek na mestu (i,j)  (v i-to vrstici, j-tem stolpcu)
        StdDraw.filledRectangle(i*K+K/2, j*K+K/2, K/2, K/2);
      }
    }
  }
  
  static void kvadratnaSpirala() {
    StdDraw.setScale(-100,100);
    
    // kje se trenutno nahajam
    double trX = 0;
    double trY = 0;
    
    // smer risanje
    int trSmer = 0;    
    int[][] smeri = new int[][] {{1,0},{0,-1},{-1,0},{0,1}};
    
    // trenutna dolžina črte
    double trDolzina = 1;
    
    for (int i = 0; i < 300; i++) {
      // izračunam koordinate nove točke (kam grem)
      double nX = trX + smeri[trSmer][0] * trDolzina;
      double nY = trY + smeri[trSmer][1] * trDolzina;
      
      // narišem črto - od tam, kjer sem, do tja, kamor grem
      StdDraw.line(trX, trY, nX, nY);
      
      // se premaknem v novo točko ...
      trX = nX;
      trY = nY;
      // ... in spremenim smer in dolžino izrisane črte
      trSmer = (trSmer + 1) % 4;
      trDolzina += 0.5;
    }
    
  }
  
  // Animacija: narišem, prikažem, počakam
  static void radar() {
    StdDraw.setScale(-100,100);
    
    
    int dolzina = 60;
    int kot = 0;
    
    // uporabim dvojni pomnilnik, da se bodo slike izrisovale v ozadju (in 
    // zato ne bo  utripanja med izrisom)
    StdDraw.enableDoubleBuffering();
    
    while (true) {
      // koordinate konice kazalca
      // za izračun koordinat uporabim "standardne formule za pretvorbo iz polarnih v kartezične koordinate".
      double x = dolzina * Math.sin(2*Math.PI * kot / 360);
      double y = dolzina * Math.cos(2*Math.PI * kot / 360);
      
      StdDraw.clear(Color.black);
    
      StdDraw.setPenColor(Color.green);
      StdDraw.setPenRadius(0.02);
      StdDraw.circle(0, 0, 20);
      StdDraw.circle(0, 0, 40);
      StdDraw.circle(0, 0, 60);
      
      // narišem kazalec
      StdDraw.line(0, 0, x, y);
      
      // premaknemsliko "iz ozadja" v ospredje ...
      StdDraw.show();
      // ... in malo počakam
      StdDraw.pause(50); 
      
      kot = (kot + 1) % 360;
    }
  }

  public static void main(String[] args) {
    // tarca();
    // barvniKvadratki();
    //kvadratnaSpirala();
    radar();
  }

}
