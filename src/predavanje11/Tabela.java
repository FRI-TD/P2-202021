package predavanje11;

/**
 *
 * @author tomaz
 */
public class Tabela {

  public static void main(String[] args) {
    String[] imena = {"Miha", "Micka", "Polde", "Janez", "Mojca"};
    
    // uporaba "foreach" zanke za izpis elementov tabele
    for (String i : imena) {
      System.out.println(i);
    }
  }
}
