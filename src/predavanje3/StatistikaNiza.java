package predavanje3;

/**
 * Izpis statistike niza. Program je predalana verzija programa iz prejsnjega tedna
 * (predavanja2.StatistikaNiza). Razlika: v novem programu je koda lepse 
 * strukturirana, koda za "izracun" statistike je zbrana v metodi z imenom 
 * izpisiStatistiko(). Metodo lahko uporabim veckrat.
 * 
 * @author tomaz
 */
public class StatistikaNiza {
  
  /**
   * Metoda za "izracun" in izpis statistike niza. 
   * - metoda je "tipa void", kar pomeni, da ne vraca rezultata;
   * - metoda mora biti "static", ker jo klicemo iz (staticne) metode main().
   * 
   * @param niz 
   */
  static void izpisiStatistiko(String niz) {
    int dolzina = niz.length();   // dolzina niza
     
     // metoda replaceAll() zamenja vse presledke v prazne nize in 
     // vrne spremenjeni niz; tega "ujamemo" v spremenljivko "brezPresledkov"
     String brezPresledkov = niz.replaceAll(" ", "");
     
     // stevilo besed v nizu je enako stevilu presledkov + 1
     int steviloBesed = dolzina - brezPresledkov.length() + 1;
     
     System.out.printf("Niz             :  %s\n",  niz); 
     System.out.printf("Prva crka       :  %c\n",  niz.charAt(0));
     System.out.printf("Zadnja crka     :  %c\n",  niz.charAt(dolzina-1));
     System.out.printf("Brez presledkov :  %s\n",  brezPresledkov);
     System.out.printf("Stevilo besed   :  %d\n",  steviloBesed);
     System.out.printf("Celotna dolzina :  %d\n",  dolzina);
     
     // obrnjen niz izpisemo crko po crki - od zadaj naprej
     System.out.printf("Obrnjen niz     :  ");
     for(int i=dolzina-1; i>=0; i=i-1) {
       System.out.print(niz.charAt(i));
     }
     System.out.println();     
  }
  
  public static void main(String [] args) {
     String niz = "Danes je lep dan!";      
     izpisiStatistiko(niz); // klic metode
     
     System.out.println("");
     
     // se en klic metode z drugim parametrom (izpis statistike drugega niza)
     izpisiStatistiko("Tretji teden predavanj"); 
  }
}
