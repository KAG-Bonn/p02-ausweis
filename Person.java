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
        geburtsdatum = new Datum(pTag, pMonat, pJahr)
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

}