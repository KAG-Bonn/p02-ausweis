public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public Datum(int pTag, int pMonat, int pJahr) {
        tag = pTag;
        monat = pMonat;
        jahr = pJahr;
    }

    public int gibTag(){
        return tag;
    }
    public int gibMonat(){
        return monat;
    }
    public int gibJahr(){
        return jahr;
    }
}