public class Anschrift {
    private String strasse;
    private String hausnummer;
    private int plz;
    private String wohnort;
    private String trenner;



public Anschrift(String pStrasse, String pHausnummer, int pPlz, Sting pWohnort, String pTrenner) {
    strasse = pStrasse;
    hausnummer = pHausnummer;
    plz = pPlz;
    wohnort = pWohnort;
    trenner = pTrenner;
}

public String gibStrasse() {
    return strasse;


}
 
public String gibHausnummer() {
    return hausnummer;


}

public String gibPlz() {
    return plz;


}
 
public String gibWohnort() {
    return wohnort;


}
public String gibTrenner() {
    return trenner;
}


public String formatiert(){
    String ergebnis;
    ergebnis = strasse + " " + hausnummer + trenner + plz + " " + wohnort;
    return ergebnis;
}
public String formatiert(String pTrenner){
    String ergebnis;
    ergebnis = strasse + " " + hausnummer + pTrenner + plz + " " + wohnort;
    return ergebnis;
}
}
