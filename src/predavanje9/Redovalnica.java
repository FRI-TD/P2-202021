package predavanje9;

/**
 * Uporaba razreda Student, njegovih metod in atributov.
 * @author tomaz
 */
public class Redovalnica {
  
  public static void main(String[] args) {
    Student s1 = new Student("Micka", 63000001);
    s1.dodajOceno(10);
    s1.dodajOceno(9);
    s1.dodajOceno(10); 
    s1.setIme("Mojca");
    
    // ... isto kot println(s1.toString())
    System.out.println(s1);    
    
    
    Student s2 = new Student("Miha");    
    s2.dodajOceno(7);
    s2.setId(6300002);
    System.out.println(s2);
    
    System.out.println(s1.getIme());
  }

}
