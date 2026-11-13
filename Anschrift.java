public class Anschrift {
    private String strasse;
    private String hausnummer;
    private int plz;
    private String wohnort;

public Anschrift() {
    strasse = "Neuseestraße";
    hausnummer = "6a";
    plz = "53111";
    wohnort = "Bonn";

}

public Anschrift(String pStrasse, String pHausnummer, int pPlz, Sting pWohnort) {
    strasse = pStrasse;
    hausnummer = pHausnummer;
    plz = pPlz;
    wohnort = pWohnort;
    
    
}

public String gibStrasse() {
    return strasse;


}
 
public String gibHausnummer() {
    return hausnummer;


}

public String gibPlz() {
    return plz;


}
 
public String gibWohnort() {
    return wohnort;


}

public String setStrasse("Neuseestrasse") {
    return strasse;


}
 
public String gibHausnummer("6b") {
    return hausnummer;


}

public String gibPlz("51232") {
    return plz;


}
 
public String gibWohnort("Köln") {
    return wohnort;


}
}

public boolean gibAlter(Datum pAktDatum) {
    int alter = pAktDatum
if(aktDatum.gibMonat()<geburtsDatum.gibMonat){
    return pAktDatum.gibJahr()-pGeburtsDatum.gibJahr()-1;
}
else if(aktDatum.gibMonat()==geburtsDatum.gibMonat){
   if(aktDatum.gibTag()<geburtsDatum.gibTag){
    return pAktDatum.gibJahr()-pGeburtsDatum.gibJahr()-1;
}
}
else{
    return pAktDatum.gibJahr()-pGeburtsDatum.gibJahr();
}

}