public class Person {
    private String vorname;
    private String nachname;
    private Datum geburtsdatum;
}
public Person (String pVorname, String pNachname, Datum pDatum) {
vorname = pVorname;
}
public vorname (String pVorname) {
    vorname = pVorname;
}
public String gibVorname () {
    return vorname;
}
public void setzeVorname (String pVorname) {
    vorname = pVorname;
    return;
}
public int gibAlter (int aktjAHR) {
return aktJahr - jahr
}
public String formatiere() {
return tag + "." + monat + "." + jahr;
}
public boolean istVolljaehrig(Datum aktDatum) {
    return gibAlter(aktDatum.gibJahr()) >= 18;
}


}

