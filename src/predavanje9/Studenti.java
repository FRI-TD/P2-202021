package predavanje9;

import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class Studenti {
  
  /**
   * Metoda prebere podatke o treh studentih. Metoda je napisanas zelo nerodno, saj
   * potrebuje veliko spremenljivk, poleg tega se koda v njej večkrat ponovi.
   * Če bi želeli namesto 3 prebrati podatke o 5 ali celo 10 studentih, bi program
   * postal še grši in neobvladljiv. 
   */
  static void preberiPodatkeOTreh() {
    String ime1, ime2, ime3;
    int    id1, id2, id3;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ime 1. študenta: ");
    ime1= sc.nextLine();
    System.out.print("ID  1. študenta: ");
    id1= sc.nextInt();
    sc.nextLine();

    System.out.print("Ime 2. študenta: ");
    ime2= sc.nextLine();
    System.out.print("ID  2. študenta: ");
    id2 = sc.nextInt();
    sc.nextLine();

    System.out.print("Ime 3. študenta: ");
    ime3= sc.nextLine();
    System.out.print("ID  3. študenta: ");
    id3= sc.nextInt();  
    sc.nextLine();
    
    System.out.println("Študent 2: " + ime2);
  }

  
  /**
   * Podobno kot v zgornji metodi, tudi tu preberemo podatke o studentih, le da namesto
   * več spremenljivk uporabljamo dve tabeli za shranjevanje imen in id-jev. 
   * Z uporabo tabel je program postal razširljiv - sedaj lahko beremo v zanki (in
   * se program nič ne spremeni, če namesto 3 preberemo 5, 10 ali celo 100 studentov).
   * 
   * @param n stevilo studentov, ki jih bomo prebrali
   */
  static void preberiPodatkeZZanko(int n) {
    String[] ime = new String[n];
    int[]    id  = new int[n];
    
    Scanner sc = new Scanner(System.in);
    
    for(int i=0; i<n; i++) {
      System.out.printf("Ime %d. študenta: ", i+1);
      ime[i] = sc.nextLine();
      System.out.printf("ID  %d. študenta: ", i+1);
      id[i]  = sc.nextInt();
      sc.nextLine();
    }

    
    System.out.println("Študent 2: " + ime[1]);
  }
  
  /**
   * Namesto večih tabel bomo v spodnji metodi uporabili samo eno tabelo - tabelo Studentov. 
   * Vsak element v tej tabeli bo vseboval vse podatke o sebi (ime, id, ...). 
   * @param n 
   */
  static void preberiPodatkeZObjekti(int n) {
    Student[] studenti = new Student[n];
    
    Scanner sc = new Scanner(System.in);
    
    for(int i=0; i<n; i++) {
      String ime; 
      int id;           
      
      System.out.printf("Ime %d. študenta: ", i+1);
      ime = sc.nextLine();
      System.out.printf("ID  %d. študenta: ", i+1);
      id  = sc.nextInt();
      sc.nextLine();
      
      studenti[i] = new Student(ime, id);
    }
    

    
    System.out.println("Študent 2: " + studenti[1].getIme());
  }
  
  
  
  public static void main(String[] args) {
    //preberiPodatkeOTreh();
    //preberiPodatkeZZanko(5);
        
    preberiPodatkeZObjekti(5);
        
    Student s = new Student("Miha", 6300001);
    //s.ime = "Miha";
    //s.id  = 6300001;
    
    Student s2 = new Student("Micka");        
    //...
    s2.setId(63001010);                
  }
  
}
