package predavanje4;

import java.io.PrintWriter;

/**
 * Izpis v tekstovno datoteko.
 * 
 * @author tomaz
 */
public class Postevanka {
  
  public static void main(String[] args) throws Exception {
    int n=7;
    int a=3;
    int b=6;
   
    // za izpis uporabljamo PrintWriter; objekt tega tipa uporabljamo
    // na enak način kot System.out -> kličemo lahko metode
    // print(), println() in printf().
    PrintWriter pw = new PrintWriter("viri/postevanka.txt");
    
    for (int i = a; i <= b; i++) {
      pw.printf("%d * %d = %d\n", i, n, i*n);
    }
        
    // na koncu sledi obvezno zapiranje!!!
    pw.close();
  }

}
