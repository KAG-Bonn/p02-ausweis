public class Fehlerprobe { 
    private int anzahlOrgane;
    private int summe = anzahlOrgane;  //[1]

    public static void main(String[] args) {
        
        System.out.println("Anzahl Organe: " + anzahlOrgane); // [2]
        int pruefwert = 5;
        System.out.println(pruefwert); // [3]
        
        if (pruefwert > 3) {
            String hinweis = "Datensatz vollstaendig";
            System.out.println(hinweis); // [4]
        }
    }
}

