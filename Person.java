public class Person {
    private String vorname;
    private String nachname;
    private Anschrift anschrift;
    private Datum geburtsdatum;

        public Datum (String pvorname, String pnachname, Anschrift panschrift, Datum pgeburtsdatum) {
        vorname = pvorname;
        nachname = pnachname;
        anschrift = panschrift;
        geburtsdatum = pgeburtsdatum;
    }

    public String gibvorname() {
        return vorname;
    }

    public void setztevorname() {
        vorname = pvorname;
        return;
    }

    public String gibnachname() {
        return nachname;
    }

    public void setztenachname() {
        nachname = pnachname;
        return;
    }

    public Anschrift gibanschrift() {
        return anschrift;
    }

    public void setzteanschrift() {
        anschrift = panschrift;
        return;
    }

    public Datum gibgeburtsdatum() {
        return geburtsdatum;
    }

    public void setztegeburtsdatum() {
        geburtsdatum = pgeburtsdatum;
        return;
    }
}