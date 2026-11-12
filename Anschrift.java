public class Anschrift {
    private String strasse;
    private String hausnummer;
    private int plz;
    private String wohnort;


    public Anschrift (String pStrasse, String pHausnummer, int pPlz, String pWohnort) {
        strasse = pStrasse;
        hausnummer = pHausnummer;
        plz = pPlz;
        wohnort = pWohnort;
    }

    public Anschrift() {
        strasse = "teststrasse";
        hausnummer = "3";
        plz = 53343;
        wohnort = "Bonn";
    }

    public void setzeStrasse (String pStrasse) {
        strasse = pStrasse;
    }

    public void setzeHausnummer (String pHausnummer) {
        hausnummer = pHausnummer;
    }

    public void setzePlz (int pPlz) {
        plz = pPlz;
    }

    public void setzeWohnort (String pWohnort) {
        wohnort = pWohnort;
    }

    public String gibStrasse () {
        return strasse;
    }

    public String gibHausnummer () {
        return hausnummer;
    }

    public int gibPlz () {
        return plz;
    }

    public String gibWohnort () {
        return wohnort;
    }

    public String formatiert() {
        String ergebnis;
        ergebnis = strasse + " " + hausnummer + "\n" + plz + " " + wohnort;
        return ergebnis;
    }

    public String formatiert2(String pTrenner) {
        String ergebnis;
        ergebnis = strasse + " " + hausnummer + pTrenner + plz + "" + wohnort;
        return ergebnis;
    }
    
}

