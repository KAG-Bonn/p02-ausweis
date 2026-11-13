public class Person {
    private String vorname;
    private String nachname;
    private Anschrift anschrift;
    private Datum geburtsdatum;


public Person ( String pVorname, String pNachname, Anschrift pAnschrift, Datum pGeburtsdatum) {
    vorname = pVorname;
    nachname = pNachname;
    anschrift = pAnschrift;
    geburtsdatum = pGeburtsdatum;
}

public Person ( String pVorname, String pNachname, Anschrift pAnschrift, int pTag, int pMonat, int pJahr) {
    vorname = pVorname;
    nachname = pNachname;
    anschrift = pAnschrift;
    geburtsdatum = new Datum(pTag, pMonat, pJahr);
}

public void setzeVorname (String pVorname) {
    vorname = pVorname;
}

public void setzeNachname (String pNachname) {
    nachname = pNachname;
}

public void setzeAnschrift (Anschrift pAnschrift) {
    anschrift = pAnschrift;
}

public void setzeGeburtsdatum (Datum pGeburtsdatum) {
    geburtsdatum = pGeburtsdatum;
}

public String gibVorname () {
    return vorname;
}

public String gibNachname () {
    return nachname;
}   

public Anschrift gibAnschrift () {
    return anschrift;
}

public Datum gibGeburtsdatum () {
    return geburtsdatum;
}

public boolean prüfeAlter (int pAlter) {
 public int gibAlter 
   

}


}