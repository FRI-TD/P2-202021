package predavanje9;

/*
 * Razred Oseba lahko deklariram kar v datoteki Dedovanje, vendar ne 
 * sme imeti dolocila "public"
 */
class Oseba {
  private String ime;
  
  Oseba() {
    this("");
  }

  public Oseba(String ime) {
    this.ime = ime;
  }
  
  public String getIme() {
    return ime;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }
  
  public String toString() {
    return "Ime osebe: " + ime;
  }
}

/*
   Razred Clovek razsiri razred Oseba. Objekti razreda Clovek imajo iste 
   atribute in metode kot objekti razreda Oseba. V razredu Clovek lahko katero 
   od metod razreda Oseba spremenimo ali dodamo nove metode in atribute.
*/
class Clovek extends Oseba {
  void izpis() {
    System.out.println(this);
  }  
}

/**
 *
 * @author tomaz
 */
public class Dedovanje {
  
  public static void main(String[] args) {
    Oseba a = new Oseba("Franci");
    System.out.println(a);    
    
    Clovek b = new Clovek();
    b.setIme("Mojca");
    b.izpis();
  }

}
