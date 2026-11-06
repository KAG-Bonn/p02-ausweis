public class Erklaerung {
    private boolean spendetNiere;
    private boolean spendetLeber;
    private boolean spendetLunge;
    private boolean spendetHerz;
    private boolean spendetHornhaut;
    
    
    public Erklaerung(int pPlz, String pHausnummer, String pWohnort) {
        spendetNiere = pSpendetNiere;
        spendetLeber = pSpendetLeber;
        spendetLunge = pSpendetLunge;
    }

    //gibTag soll ein nummer haben deswegen davor int schreiben  //bei einer Anfrage steht schon der Wertart wie z.B. int
    public int gibStrasse() {
        return strasse; //tag ist Artibut //return gibt tag zurück
    }

    public void setzeTag(int pTag) { //Bei was eingeben schreibt man void
        tag = pTag;
    }
}