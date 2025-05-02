public class AppPersonal {
    public static void main(String[] args) {
        PersonalVerwaltung pv = new PersonalVerwaltung();

        // Mitarbeiter anlegen
        Mitarbeiter alice = new Mitarbeiter("Alice");
        Mitarbeiter bob   = new Mitarbeiter("Bob");
        pv.addMitarbeiter(alice);
        pv.addMitarbeiter(bob);

        pv.listMitarbeiter();

        // Abrechnungen erzeugen
        Abrechnung a1 = new GehaltsAbrechnung(alice, 3000.0);
        Abrechnung a2 = new LohnAbrechnung(bob, 20.0, 160.0);
        pv.addAbrechnung(a1);
        pv.addAbrechnung(a2);

        // Alle Abrechnungen der Periode 1 ausgeben
        pv.listAbrechnungen(1);
    }
}
