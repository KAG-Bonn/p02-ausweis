public class Datum{
    private int tag;
    private int monat;
    private int jahr;
    }
    
    public Datum(int pTag, int pMonat, int pJahr) {
        tag = pTag;
        monat = pMonat;
        jahr = pJahr;
    }

    //gibTag soll ein nummer haben deswegen davor int schreiben  //bei einer Anfrage steht schon der Wertart wie z.B. int
    public int gibTag() {
        return tag; //tag ist Artibut //return gibt tag zurück
    }

    public void setzeTag(int pTag) { //Bei was eingeben schreibt man void
        tag = pTag;
        return;
    }

    public int gibMonat() {
        return monat; 
    }

     public void setzeTag(int pMonat) { 
        monat = pMonat;
        return;
    }

    public int gibJahr() {
        return jahr; 
    }

     public void setzeJahr(int pJahr) { 
        jahr = pJahr;
        return;
    }

    public int gibAlter(Datum pAktDatum) {
        int alter = pAktDatum.gibJahr() - pGeburtsDatum.gibJahr() - 1;
        if(aktDatum.gibMonat()<geburtsDatum.gibMonat()){
        return pAktDatum.gibJahr() - pGeburtsDatum.gibJahr() - 1;
    } 

    else if(aktDatum.gibMonat()==geburtsDatum.gibMonat()){
        if (aktDatum.gibTag()<geburtsDatum.gibTag()) {
            return pAktDatum.gibJahr() - pGeburtsDatum.gibJahr() - 1;
        }
        
    } 

     else{
            return pAktDatum.gibJahr() - pGeburtsDatum.gibJahr() - 1;
        }
    }

    public String formatiere() {

    }

    