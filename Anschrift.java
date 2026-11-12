public class Anschrift{
    private String strasse;
    private String hausnummer;
    private int plz;
    private String wohnort;

    public Anschrift (String pstrasse, String phausnummer, int pplz, String pwohnort) {
        strasse = pstrasse;
        hausnummer = phausnummer;
        plz = pplz;
        wohnort = pwohnort;
    }

    public String gibstrasse() {
        return strasse;
    }

    public void setzestrasse() {
        strasse = pstrasse;
        return;
    }

    public String gibhausnummer() {
        return hausnummer;
    }

    public void setzehausnummer() {
        hausnummer = phausnummer;
        return;
    }
    
    public int gibplz() {
        return plz;
    }

    public void setzeplz() {
        plz = pplz;
        return;
    }

    public String gibwohnort() {
        return wohnort;
    }

    public void setzewohnort() {
        wohnort = pwohnort;
        return;
    }
    

    public String formatiert() {
        String ergebnis;
        ergebnis = strasse + " " + hausnummer + "\n" + plz + " " + wohnort;
        return ergebnis;
    }

    public String formatiert(String pTrenner) {
        String ergebnis;
        ergebnis = strasse + " " + hausnummer + pTrenner + plz + " " + wohnort;
        return ergebnis;
    }

}