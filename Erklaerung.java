public class Erklaerung {
    private boolean spendetNiere;
    private boolean spendetLeber;
    private boolean spendetHerz;
    private boolean spendetLunge;
    private boolean spendetHornhaut;

    public Erklaerung(boolean pSpendetNiere, boolean pSpendetLeber, boolean pSpendetHerz, boolean pSpendetLunge, boolean pSpendetHornhaut) {
    spendetNiere = pSpendetNiere;
    spendetLeber = pSpendetLeber;
    spendetHerz = pSpendetHerz;
    spendetLunge = pSpendetLunge;
    spendetHornhaut = pSpendetHornhaut;
    }

public boolean gibSpendetNiere () {
    return spendetNiere;
}

public void setzeSpendetNiere (boolean pSpendetNiere) {
    spendetNiere = pSpendetNiere
    return;
}
}