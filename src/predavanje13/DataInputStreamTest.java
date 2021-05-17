package predavanje13;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Iz datoteke, katere ima je podano v prvem argumentu, preberem tri podatke: en integer (magic number) 
 * in dva podatka tipa short (minor in major number). 
 *
 * Za format class datoteke glej: https://en.wikipedia.org/wiki/Java_class_file
 * @author tomaz
 */
public class DataInputStreamTest {
  public static void main(String[] args) {
    // args = new String[]{"build/classes/predavanje1/Obresti.class"};
    
    try {
      // Datoteko odprem in jo "ovijem" z FileInput in DataInput tokom
      File f1 = new File(args[0]);
      FileInputStream fis = new FileInputStream(f1);
      DataInputStream dis = new DataInputStream(fis);
      
      // podatke v datoteki berem z metodami, ki jih ponuja DataInput tok
      int magic = dis.readInt();
      short minor = dis.readShort();
      short major = dis.readShort();
      
      System.out.printf("Magic: %x\n", magic);
      System.out.printf("Minor version: %d\n", minor);
      System.out.printf("Major version: %d\n", major);
      
      // obvezno zapiranje toka!
      dis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    } 
    
    
  }
}
