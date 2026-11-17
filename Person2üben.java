public class Person2üben {
    private String vorname;
    private String nachname;
    private Datum Datum;

public Person2üben (String pVorname, String pNachname, Datum pDatum) {
    nachname = pNachname;
    vorname = pVorname;
    Datum = pDatum;
}
    
public void setzeDatum (String pVorname){
    vorname = pVorname;
}

public void setzteNachname (String pNachname) {
    nachname = pNachname;
}

public void setzteDatum (Datum pDatum) {
    Datum = pDatum;
}

public String gibVorname () {
    return vorname;
}
public String gibNachname () {
    return nachname;
}
public Datum gibDatum () {
    return Datum;
}
}
