public class Anschrift{
    private String strasse;
    private String hausnummer;
    private String wohnort;
    private int plz;
    private String trenner;


    public Anschrift(int pPlz, String pHausnummer, String pWohnort, pTrenner) {
        strasse = pStrasse;
        hausnummer = pHausnummer;
        wohnort = pWohnort;
        trenner = pTrenner;
    }

    //gibTag soll ein nummer haben deswegen davor int schreiben  //bei einer Anfrage steht schon der Wertart wie z.B. int
    public int gibStrasse() {
        return strasse; //tag ist Artibut //return gibt tag zurück
    }

    public void setzeStrasse(String pStrasse) { //Bei was eingeben schreibt man void
        strasse = pStrasse;
    }

    public void setzeTrenner(String pTrenner){
        trenner = "\n"
    }
    
    public String formatiert(){
        String ergebnis;
        ergebnis = strasse + " " + hausnummer + pTrenner + plz + " " + wohnort;  
        return ergebnis;
    }    
}