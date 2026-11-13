public class Person {
    private String vorname;
    private String nachname;
    private Anschrift anschrift;
    private Datum geburtsdatum;

    public Person (String pvorname, String pnachname, Anschrift panschrift, Datum pgeburtsdatum) {
        vorname = pvorname;
        nachname = pnachname;
        anschrift = panschrift;
        geburtsdatum = pgeburtsdatum;
    }

    public Person (String pvorname, String pnachname, String pAnschrift, int pTag, int pMonat, int pJahr) {
        vorname = pvorname;
        nachname = pnachname;
        anschrift = pAnschrift;
        geburtsdatum = new Datum(pTag, pMonat, pJahr);
    }

    public Person (String pvorname, String pnachname) {
        vorname = pvorname;
        nachname = pnachname;
        anschrift = new Anschrift();
        geburtsdatum = new Geburtsdatum();
    }

    public String gibvorname() {
        return vorname;
    }

    public void setzevorname() {
        vorname = pvorname;
        return;
    }

    public String gibnachname() {
        return nachname;
    }

    public void setzenachname() {
        nachname = pnachname;
        return;
    }

    public Anschrift gibanschrift() {
        return anschrift;
    }

    public void setzeanschrift() {
        anschrift = panschrift;
        return;
    }

    public Datum gibgeburtsdatum() {
        return geburtsdatum;
    }

    public void setzegeburtsdatum() {
        geburtsdatum = pgeburtsdatum;
        return;
    }

    public Anschrift gibAnschrift() {
        return anschrift;
    }

    public Datum gibGeburtsdatum() {
        return geburtsdatum;
    }

    Person mika = new Person("Mika", "Keller");
    System.out.printIn(mika.gibAnschrift().strasse);
    
    
    public int gibAlter(Datum paktDatum){
        if(paktDatum.gibMonat() < geburtsdatum.gibMonat()) {
            return paktDatum.gibjahr() - geburtsdatum.gibjahr() - 1;
        }
        else if (paktDatum.gibMonat() == geburtsdatum.gibMonat()) {
            if (aktDatum.gibTag() < geburtsdatum.gibTag()) {
                return paktDatum.gibjahr() - geburtsdatum.gibjahr() - 1;
            }
        }
        else {
            return paktDatum.gibjahr() - geburtsdatum.gibjahr();
        }
    }

    public boolean istvolljaehrig(int gibAlter()){
        return gibAlter >= 18;
    }   
}

    //public boolean prüfeAlter(int pAlter, Datum aktDatum) {
    //aktDatum.gibjahr() - geburtsdatum.gibjahr()}
    //zwei datumsobjekte wie gucken, wie alt es ist monat vergleichen wenn gleich tag vergleichen
    //Verzweigung: if, else if (manchmal wenn man es braucht), else + bedingungen wann es erfüllt ist