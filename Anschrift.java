public class Anschrift {
    private String strasse;
    private String hausnummer;
    private int plz;
    private String wohnort;
}


public Anschrift (String pStrasse, String pHausnummer, int pPlz, String pWohnort) {
    strasse = pStrasse; 
    hausnummer = pHausnummer;
    plz = pPlz;
    wohnort = pWohnort;
}

public Anschrift() {
        strasse = "teststrasse";
        hausnummer = "1b";
        plz = 12345;
        wohnort = "Bonn";
    }

public String gibStrasse() {
    return strasse;
}

public String gibHausnummer() {
    return hausnummer;
}

public int gibPlz() {
    return plz;
}

public String gibWohnort() {
    return wohnort;
}

public void setzeStrasse(String pStrasse) {
    strasse = pStrasse;
}

public void setzeHausnummer(String pHausnummer) {
    hausnummer = pHausnummer;
}

public void setzePlz(int pPlz) {
    plz = pPlz;
}

public void setzeWohnort(String pWohnort) {
    wohnort = pWohnort;
}