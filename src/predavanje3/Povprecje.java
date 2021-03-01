package predavanje3;

import java.util.Scanner;

/**
 * Program prebere ocene, ki jih eno za drugo vpisuje uporabnik, dokler ne 
 * vpiše 0. Na koncu program izracuna in izpise povprecje vseh vpisanih ocen.
 * 
 * @author tomaz
 */
public class Povprecje {
  
  public static void main(String[] args) {
    // za branje iz tipkovnice uporabimo Scanner + System.in
    Scanner sc = new Scanner(System.in);
    
    int x = -1;    // trenutna vpisana ocena
    int vsota = 0; // vsota vseh vpisanih ocen
    int n     = 0; // steviulo do sedaj prebranih ocen
    
    // zanko za branje ponavljamo, dokler uporabnik ne vpise 0
    while (x != 0) {
      System.out.print("Vpisi oceno: ");
      x = sc.nextInt(); // preberemo naslednjo oceno ...
      
      // ... in ce je ta razlicna od 0, jo pristejemo k vsoti ...
      if (x != 0) {
        vsota = vsota + x;
        n = n + 1; // ... in povecamo stevec skupnega stevila vpisanih ocen.
      }
    }
    
    // preden izpisemo rezultat, preverimo, ali je uporabnik sploh vpisal 
    // kaksno oceno (ce tega ne preverimo, pride do deljenja z nic)
    if (n != 0) {
      // ker sta "vsota" in "n" celi stevili, bi deljenje "vsota/n" pomenilo
      // celostevilsko deljenje; ce zelimo realen rezultat (na vec decimalk 
      // natancno), v izracun dodamo "1.0*" - s tem imenovalec spremenimo v 
      // realno stevilo, operacijo "/" pa v realno deljenje.
      double povprecje = 1.0*vsota / n;    
      
      System.out.printf("Povprecje %d vpisanih ocen je %.2f\n", n, povprecje);
    } else {
      System.out.println("No, pa nič! Adijo!");
    }
  }

}
