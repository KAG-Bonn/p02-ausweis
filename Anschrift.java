public class Anschrift {
    private String strasse;
    private String hausnummer;
    private int plz;
    private String wohnort;
}
public Anschrift(String pStrasse, String pHausnummer, int pPlz, String pWohnort) {
    strasse = pStrasse;
    hausnummer = pHausnummer;
    plz = pPlz;
    wohnort = pWohnort;
}
public String gibStrasse() {
    return tag;
}
public void setzeStrasse (String pStrasse) {
    strasse = pStrasse;
    return;
}