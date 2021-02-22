package predavanje2;

/**
 * Izpis statistike niza.
 * 
 * @author tomaz
 */
public class StatistikaNiza {
  public static void main(String [] args) {
     String niz = "Danes je lep dan!"; 
     
     int dolzina = niz.length();   // dolzina niza
     
     // metoda replaceAll() zamenja vse presledke v prazne nize in 
     // vrne spremenjeni niz; tega "ujamemo" v spremenljivko "brezPresledkov"
     String brezPresledkov = niz.replaceAll(" ", "");
     
     // stevilo besed v nizu je enako stevilu presledkov + 1
     int steviloBesed = dolzina - brezPresledkov.length() + 1;
     
     System.out.printf("Vpisan niz      :  %s\n",  niz); 
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
}
