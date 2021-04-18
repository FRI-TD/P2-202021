package predavanje8;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

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
  
  // Graf funkcije v koordinatnem sistemu
  static void graf() {
    double H=1000;
    double W=1000;
    StdDraw.setScale(0,1000);
    double x1=-2*Math.PI, x2=2*Math.PI;
    double y1=-1, y2 = 1;

    double lX=-1, lY=-1;
    
    StdDraw.line(0,H/2, W,H/2);
    StdDraw.line(W/2,0, W/2, H);

    for (int j = 0; j < W; j++) {
      double x = 1.0*(x2-x1)/W*j + x1;
      double y = Math.sin(x);
      int i = (int) (H*(y-y1)/(y2-y1));

      if ((i>=0 && i<H) && (lX!=-1 && lY!=-1))
        StdDraw.line(lX, lY, j, i);
      lX = j; lY = i;
    }
  }
  
  // Različne siprale. tip = tip spirale, n = število korakov
  static void spirala(int tip, int n) {
    StdDraw.setScale(-100,100);

    double pX = -1, pY=0;

    double r=0;
    double kot=0;
    for (int i = 0; i < n; i++) {
      kot = kot + (2*Math.PI/100);
      switch (tip) {
        case 1: r = 50 / Math.sqrt(kot); break;
        case 2: r= 10 * Math.sqrt(kot);  break;
        case 3: r = 1.01* kot;   break;
        case 4: r = 100/kot;  break;
      }
      double x = Math.cos(kot) * r;
      double y = Math.sin(kot) * r;
      if (pX != -1)
        StdDraw.line(pX,pY,x,y);
      pX = x; pY = y;
    }
  }

  
  // Risanje rož in vitražov
  static void nRoze(int n, int velikost) {
    StdDraw.setScale(-150,150);

    double trX=0, trY=0;
    double trSmer = 0;
    for (int j = 0; j < n ; j++) {
      for (int i = 0; i < n; i++) {
        double nX = trX + velikost * (i == 0 ? 2 : 1) * Math.cos(trSmer);
        double nY = trY + velikost * (i == 0 ? 2 : 1) * Math.sin(trSmer);

        StdDraw.line(trX, trY, nX, nY);
        trX = nX;
        trY = nY;

        if (i < n - 1)
          trSmer += (2 * Math.PI / n);
      }
    }
  }
  
  /**
   * Izris kazalca; metoda je uporabna za izris radarja in za uro
   * @param dolzina Dolzina kazalca
   * @param kot Kot kazalca v stopinjah (0 pomeni navpično); večanje kota gre v smeri urinega kazalca
   * @param debelina Debalina čopiča za izris kazalca
   */
  static void kazalec(double dolzina, double kot, double debelina) {
    // Kazalec narišem od točke (0,0) do točke, podane v polarnih koordinatah (dolzina, kot)    
    // Pretvorba iz polarnih v kartezične koordinate
    double x = dolzina * Math.sin(2 * Math.PI * kot / 360);
    double y = dolzina * Math.cos(2 * Math.PI * kot / 360);

    StdDraw.setPenRadius(debelina);
    StdDraw.line(0, 0, x, y);
  }  
  
  
  // Prikaz trenutne ure
  static void ura() {
    StdDraw.setScale(-100, 100);

    for (;;) {
      StdDraw.clear();

      StdDraw.setPenRadius(0.03);
      for (int i = 0; i < 12; i++) {
        double x1 = 85 * Math.sin(2 * Math.PI * i / 12);
        double y1 = 85 * Math.cos(2 * Math.PI * i / 12);
        double x2 = 90 * Math.sin(2 * Math.PI * i / 12);
        double y2 = 90 * Math.cos(2 * Math.PI * i / 12);

        double x3 = 98 * Math.sin(2 * Math.PI * i / 12);
        double y3 = 98 * Math.cos(2 * Math.PI * i / 12);

        StdDraw.line(x1, y1, x2, y2);
        StdDraw.text(x3, y3, Integer.toString(i == 0 ? 12 : i));
      }
      StdDraw.setPenRadius(0.005);
      for (int i = 0; i < 60; i++) {
        double x1 = 85 * Math.sin(2 * Math.PI * i / 36);
        double y1 = 85 * Math.cos(2 * Math.PI * i / 36);
        double x2 = 90 * Math.sin(2 * Math.PI * i / 36);
        double y2 = 90 * Math.cos(2 * Math.PI * i / 36);
        StdDraw.line(x1, y1, x2, y2);
      }

      SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:SS");
      String ura = sdf.format(new Date());

      String[] uraP = ura.split(":");
      int hh = Integer.parseInt(uraP[0]);
      int mm = Integer.parseInt(uraP[1]);
      int ss = Integer.parseInt(uraP[2]);
      int SS = Integer.parseInt(uraP[3]);

      kazalec(90, 6 * (ss + 1.0 * SS / 1000), 0.005);
      kazalec(80, 6 * (mm + 1.0 * ss / 60), 0.02);
      kazalec(60, 30 * (hh + 1.0 * mm / 60), 0.03);

      StdDraw.text(-85, 95, String.format("%02d:%02d:%02d", hh, mm, ss));
      StdDraw.show(10);
    }
  }  
  
  public static void main(String[] args) {
    // tarca();
    // barvniKvadratki();
    //kvadratnaSpirala();
    //radar();
    
    // graf();
    // spirala(4,1000);
    // nRoze(5,30);
    
    ura();
  }

}
