package predavanje12;

import java.io.File;

/**
 * Razred File ponuja različne metode za dostop do datoteke. 
 * Spodnji program demonstrira uporabo nekaterih od njih.
 * 
 * @author tomaz
 */
public class TestFile {
  
  public static void main(String[] args) {
    File f = new File("/Users/tomaz/Dropbox/FRI/pedagosko/P2/L202021/sources/predavanja/viri");    
    System.out.println("Obstaja:    " + f.exists());
    System.out.println("Je folder?  " + f.isDirectory());
    
    File f2 = new File(f, "d.docx");
    System.out.println(f2.exists());
    System.out.println(f2.isDirectory());
    System.out.println(f2.length());
    f2.delete();
    
    File f3 = new File(f, "abc/def/xyz");
    // mkdirs() naredi "verigo" folderjev
    f3.mkdirs();
    
    System.out.println("Vsebina direktorija " + f.getAbsolutePath());
    // metoda list() vrne seznam vseh datotek nekega direktorija
    String[] vsebina = f.list();
    for (String v : vsebina) {
      System.out.println(v);
    } 
  }

}
