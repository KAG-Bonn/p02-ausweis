public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public Datum() {
        tag = 1;
        monat = 1;
        jahr = 2026;
    }

    public Datum(int pTag, int pMonat, int pJahr) {
        tag = pTag;
        monat = pMonat;
        jahr = pJahr;
    }
}