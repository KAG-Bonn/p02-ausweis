public class Anschrift{
    private String strasse;
    private String hausnummer;
    private int plz;
    private String wohnort;

    public Anschrift(String pstrasse, String phausnummer, int pplz, String pwohnort) {
        strasse = pstrasse;
        hausnummer = phausnummer;
        plz = pplz;
        wohnort = pwohnort;
    }

    public String gibhausnummer() {
        return hausnummer;
    }

    public void setzteplz() {
        plz = pplz;
        return;
    }
}