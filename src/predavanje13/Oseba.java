package predavanje13;

import java.io.Serializable;

/**
 * Demo razred za uporabo v programu Imenik (pisanje in branje
 * objektov v datoteko)
 * 
 * Če želimo objekte razreda Oseba zapisati v datoteko,
 * mora razred Oseba implementirati vmesnik Serializable!
 * 
 * @author tomaz
 */
public class Oseba implements Serializable {
  String ime;
  
  Oseba(String ime) {
    this.ime = ime;
  }
}
