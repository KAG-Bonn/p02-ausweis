public class Erklaerung{
    private boolean spendetNiere;
    private boolean spendetLeber;
    private boolean spendetHerz;
    private boolean spendetLunge;
    private boolean spendetHornhaut;

    public Erklaerung(boolean pspendetNiere, boolean pspendetLeber, boolean pspendetHerz, boolean pspendetLunge,boolean pspendetHornhaut) {
    spendetNiere = pspendetNiere;
    spendetLeber = pspendetLeber;
    spendetHerz = pspendetHerz;
    spendetLunge = pspendetLunge;
    spendetHornhaut = pspendetHornhaut;
    }

    public boolean gibspendetNiere() {
        return spendetNiere;
    }

    public void setztespendetNiere() {
        spendetNiere = pspendetNiere;
        return;
    }

    public boolean gibspendetLeber() {
        return spendetLeber;
    }

    public void setztespendetLeber() {
        spendetLeber = pspendetLeber;
        return;
    }

    public boolean gibspendetHerz() {
        return spendetHerz;
    }

    public void setztespendetHerz() {
        spendetHerz = pspendetHerz;
        return;
    }

    public boolean gibspendetLunge() {
        return spendetLunge;
    }

    public void setztespendetLunge() {
        spendetLunge = pspendetLunge;
        return;
    }

    public boolean gibspendetHornhaut() {
        return spendetHornhaut;
    }

    public void setztespendetHornhaut() {
        spendetHornhaut = pspendetHornhaut;
        return;
    }
}