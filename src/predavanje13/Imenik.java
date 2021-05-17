package predavanje13;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Pisanje in branje objektov v/iz datoteke. 
 * 
 * @author tomaz
 */
public class Imenik {

  /**
   * Metoda ustvari dva objekta razreda Oseba in ju zapiše v datoteko.
   */
  static void zapisiPodatke() {
    Oseba o1 = new Oseba("Janez");
    Oseba o2 = new Oseba("Micka");
    
    try {
      // za zapisovanje objektov v datoteko potrebujem tok tipa ObjectOutputStream
      File f1 = new File("viri/imenik.bin");
      FileOutputStream fos = new FileOutputStream(f1);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
    
      // serializacija objekta in zapis v datoteko
      oos.writeObject(o1);
      oos.writeObject(o2);
    
      oos.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }    
  }
  
  /**
   * Metoda iz podatkov, zapisanih v datoteki, ustvari dva objekta tipa Oseba. 
   */  
  static void preberiPodatke() {
    try {
      // za branje objektovizv datoteke potrebujem tok tipa ObjectInputStream
      File f1 = new File("viri/imenik.bin");
      FileInputStream fis = new FileInputStream(f1);
      BufferedInputStream bis = new BufferedInputStream(fis); // opcijsko lahko dodam Buffered tok, da pospešim branje
      ObjectInputStream ois = new ObjectInputStream(bis);

      // preberem podatke iz datoteke in jih deserializiram v objekta tipa Oseba
      Oseba o1 = (Oseba) ois.readObject();
      Oseba o2 = (Oseba) ois.readObject();
      
      System.out.println(o1.ime);
      System.out.println(o2.ime);
      
      ois.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
  
  public static void main(String[] args) {
    // zapisiPodatke();
    preberiPodatke();
    
  }
}
