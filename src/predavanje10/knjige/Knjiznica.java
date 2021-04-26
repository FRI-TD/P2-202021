package predavanje10.knjige;

import predavanje10.knjige.StrokovnaKnjiga;



/**
 * Program za vodenje evidenc o knjigah. Knjiznica lahko vsebuje dva tipa knjig - leposlovje in strokovne 
 * knjige, zato potrebujem dva razreda: Leposlovje in StrokovnaKnjiga. Ker imata razreda skupne lastnosti 
 * (naslov, avtor, ...), je smiselno, da ta oba razreda naslednika splošnega razreda z imenom Knjiga.
 * 
 * @author tomaz
 */
public class Knjiznica {

  // Test delovanja razredov Leposlovje in StrokovnaKnjiga
  public static void main(String[] args) {
    
    String indeks = "aload:179,371; arithmetic:45; arrays:55; attributes: 101; baload:187;binary:75";
    Knjiga b1 = new StrokovnaKnjiga("The JVM Specification", "Tim Lindholm", 2012, indeks);
    b1.izpis();

    
    Leposlovje b2 = new Leposlovje("Pestrna","France Bevk", 1939);
    b2.dodajMnenje("Lepa, poučna knjiga");
    b2.dodajMnenje("Knjiga prikazuje dogodke naše zgodovine. Težko branje.");
    b2.dodajMnenje("Bravo France, še več takih knjig!");
    b2.izpis();
    
    // ... ne gre, saj je Knjiga abstraktni razred!
    // Knjiga c = new Knjiga("naslov", "avtor", 1990);
    
    System.out.println(b1 instanceof StrokovnaKnjiga);
    System.out.println(b1 instanceof Knjiga);
    System.out.println(b1 instanceof Leposlovje);
    System.out.println(b2 instanceof Leposlovje);
  }
}
