import java.util.ArrayList;
import java.util.Iterator;

public class PersonalVerwaltung {
    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private ArrayList<Abrechnung> abrechnungen = new ArrayList<>();

    // Mitarbeiter-Verwaltung
    public void addMitarbeiter(Mitarbeiter m) {
        mitarbeiterListe.add(m);
    }
    public boolean removeMitarbeiter(Mitarbeiter m) {
        return mitarbeiterListe.remove(m);
    }
    public void listMitarbeiter() {
        System.out.println("---- Mitarbeiter ----");
        for (Mitarbeiter m : mitarbeiterListe) {
            System.out.println(m);
        }
    }

    // Abrechnungs-Verwaltung
    public void addAbrechnung(Abrechnung a) {
        abrechnungen.add(a);
    }
    public boolean removeAbrechnung(Abrechnung a) {
        return abrechnungen.remove(a);
    }
    public void listAbrechnungen(int periode) {
        System.out.println("---- Abrechnungen für Periode " + periode + " ----");
        for (Abrechnung a : abrechnungen) {
            if (a.getPeriode() == periode) {
                System.out.println(a);
            }
        }
    }
}
