public class Anschrift{
    private String strasse;
    private String hausnummer;
    private String wohnort;
    private int plz;


    public Anschrift(int pPlz, String pHausnummer, String pWohnort) {
        strasse = pStrasse;
        hausnummer = pHausnummer;
        wohnort = pWohnort;
    }

    //gibTag soll ein nummer haben deswegen davor int schreiben  //bei einer Anfrage steht schon der Wertart wie z.B. int
    public int gibStrasse() {
        return strasse; //tag ist Artibut //return gibt tag zurück
    }

    public void setzeTag(int pTag) { //Bei was eingeben schreibt man void
        tag = pTag;
    }
}