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
    }