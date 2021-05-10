package predavanje12;

// Opozorilo, ki ga dobimo, če pri ustvarjanju zbirke na desni srani ne navedemo 
// tipa podatkov, ki bodo v zbirki.
//
//    Note: results/tmp/DN10.java uses unchecked or unsafe operations.
//    Note: Recompile with -Xlint:unchecked for details.
//
// Napačno:
//    ArrayList<Oseba> seznamOseb = new ArrayList();
//
// Pravilno:
//    ArrayList<Oseba> seznamOseb = new ArrayList<>();
// ali
//    ArrayList<Oseba> seznamOseb = new ArrayList<Oseba>();



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Razred Oseba vsebuje dva atributa: ime in visina.
 * Če želimo objekte tega razreda medseboj primerjat, moramo v razredi 
 * implementirati vmesnik Comparable (in napisati metodo compareTo())
 */
class Oseba implements Comparable<Oseba> {
  String ime;
  int visina;
  
  Oseba(String ime, int visina) {
    this.ime = ime;
    this.visina = visina;
  }

  @Override
  public String toString() {
    return String.format("[%s, %d]", this.ime, this.visina);
  }

  @Override
  public int compareTo(Oseba o) {
    // primerjam this in o po imenh
    return this.ime.compareTo(o.ime);
  }

}

/**
 *
 * @author tomaz
 */
public class Urejanje {
  public static void main(String[] args) {
    int[] stevila = new int[]{4,2,9,1,5,6,7,0,3};
    System.out.println("Neurejena števila: ");
    System.out.println(Arrays.toString(stevila));
    // urejanje tabele števil
    System.out.println("Urejena števila: ");
    Arrays.sort(stevila);
    System.out.println(Arrays.toString(stevila));
    
    // tabela oseb
    Oseba[] tabelaOseb = new Oseba[]{new Oseba("Micka", 180), new Oseba("Janez", 165), new Oseba("Žan", 201), new Oseba("Mojca",172), new Oseba("Ana",190)};
    System.out.println("Osebe v vrstnem redu, kot so bile dodane: ");
    System.out.println(Arrays.toString(tabelaOseb)); 
    
    // urejanje po imenih (privzet način primerjanja); za urejanje se uporabi
    // metoda compareTo() razreda Oseba
    Arrays.sort(tabelaOseb);
    System.out.println("Osebe, urejene po imenu:");
    System.out.println(Arrays.toString(tabelaOseb)); 
    System.out.println("");
    
    // urajanje po visini (s primerjalnikom, ki je podan ob klicu metode sort()
    // "povozimo" obstoječ primerjalnik iz razreda Osebe
    Arrays.sort(tabelaOseb, new Comparator<Oseba>() {
      public int compare(Oseba o1, Oseba o2) {
        return o1.visina - o2.visina;
      }      
    });
    System.out.println("Osebe, urejene po višini:");
    System.out.println(Arrays.toString(tabelaOseb)); 

    
    // ustvarim prazen seznam in ga napolnim z elementi iz tabelaOseb
//    ArrayList<Oseba> seznamOseb = new ArrayList<>();
//    for (Oseba oseba : tabelaOseb) {
//      seznamOseb.add(oseba); 
//    }
    
    // ustvarim seznam, ki vsebuje iste osebe kot tabelaOseb (isto kot zgornje 3 zakomentirane vrstice)
    ArrayList<Oseba> seznamOseb = new ArrayList<>(Arrays.asList(tabelaOseb));
    
    System.out.println("Seznam oseb");
    System.out.println(seznamOseb);
    
    Collections.sort(seznamOseb);
    System.out.println(seznamOseb);
  }
}
 