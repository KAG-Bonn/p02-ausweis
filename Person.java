public class Person {
    private String vorname;
    private String nachname;
    private Anschrift anschrift;
    private Datum geburtsdatum;
    private Erklaerung erklaerung;
}

public boolean pruefeAlter(int pAlter, Datum aktDatum){
    aktDatum.gibJahr() - geburtsdatum.gibjahr()
}

public int gibAlter(Datum pAktDatum){
    
    if(aktDatum.gibMonat() < geburtsdatum.gibMonat()){
      return pAktDatum.gibJahr() - pGeburtsdatum.gibJahr();
    }
    else if(aktDatum.gibMonat() = geburtsdatum.gibMonat()){
        return pAktDatum.gibJahr() = pGeburtsdatum.gibJahr();
        else{
            return
        }
    }
    else{
        return pAktDatum.gibJahr() - pGeburtsdatum.gibjahr();
    }
}

public boolean istVolljährig(){
    if(gibAlter() >= 18){
        return true;
    }
    else{
        return false;
    }
}